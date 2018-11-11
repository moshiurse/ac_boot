package com.project.accounting.services;

import java.util.List;
import java.util.Optional;

import com.project.accounting.model.AppUser;

public interface AppUserService {

	AppUser saveUser(AppUser appUser);

	AppUser findByUserName(String userName);

	AppUser findByEmail(String email);

	List<AppUser> showActiveUserBycompany(int company);

	List<AppUser> showAllUserBycompany(int company);

	List<AppUser> showUserByIdNameOrUserNameByCompany(String searchValue, int company);
	
	void deleteUser(Long ide, int company);
	
	Optional<AppUser> getUserById(Long id);

	boolean isUserExists(String username, String email);
	
}
