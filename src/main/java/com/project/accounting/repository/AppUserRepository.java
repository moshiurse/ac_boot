package com.project.accounting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import com.project.accounting.model.AppUser;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long> {
// Find By Username
	AppUser findByUserName(@Param("userName") String userName);

//Find By Email
	AppUser findByEmail(@Param("email") String email);

//Show Active users from a company
	@Query("select  u from AppUser u where u.enabled = 1 and u.company = :company")
	List<AppUser> showActiveUserBycompany(@Param("company") int company);

//	show All users from a company
	List<AppUser> findByCompany(@Param("company") int company);

// Search Users from company by Their Full Name, Username and Id
@Query("select u from AppUser u where u.company = :company and (u.id like \'%:searchValue%\'" +
		" or u.userName like \'%:searchValue%\' or u.fullName like \'%:searchValue%\') and u.enabled= 1")
	List<AppUser> showUserByIdNameOrUserNameByCompany(@Param("searchValue") String searchValue, @Param("company") int company);

	Optional<AppUser> findById(Long id);

// disable an user
	@Transactional
	@Modifying
	@Query("update AppUser u set u.enabled = 0 where u.id = :id and u.company = :company ")
	void deleteUser(@Param("id") Long id,@Param("company") int company);

	@Query("select u from AppUser u where u.email = \':email\' or u.userName = \':userName\'")
	boolean isUserExists(String email, String userName);

}
