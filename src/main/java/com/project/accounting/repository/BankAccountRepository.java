package com.project.accounting.repository;

import com.project.accounting.model.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Moshiur on 11/15/2018.
 */
public interface BankAccountRepository extends JpaRepository<BankAccount, Long>{

List<BankAccount> findByCompany(@Param("company") int company);

@Query("select ba from BankAccount ba where ba.display = 1 and ba.company = :company")
List<BankAccount> showActiveBankAccount(@Param("company") int company);

@Transactional
@Modifying
@Query("update BankAccount ba set ba.display = 0 where ba.accountId = :id and ba.company = :company")
void disableBankAccount(@Param("id") Long id,@Param("company") int company);

@Query("select ba from BankAccount ba where ba.company = :company and (ba.accountId like \'%:searchValue%\'" +
		" or ba.accountNo like \'%:searchValue%\') and ba.display= 1")
List<BankAccount> findBankAccountByIdOrNo(@Param("searchValue") String searchValue, @Param("company") int company);

}
