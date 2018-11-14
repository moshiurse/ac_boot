package com.project.accounting.repository;

import com.project.accounting.model.BankInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Moshiur on 11/15/2018.
 */
public interface BankInfoRepository extends JpaRepository<BankInfo, Integer>{

List<BankInfo> findById(@Param("id") int id);

@Query("select bi from BankInfo bi where bi.enabled = 1")
List<BankInfo> showActiveBank();

@Transactional
@Modifying
@Query("update BankInfo bi set bi.enabled = 0 where bi.id = :id")
void disableBank(@Param("id") int id);

@Query("select bi from BankInfo bi where (bi.id like \'%:searchValue%\'" +
		" or bi.bankName like \'%:searchValue%\' or bi.bankShortName like \'%:searchValue%\')" +
		" and bi.enabled= 1")
List<BankInfo> findBankByIdOrNameOrShortName(@Param("searchValue") String searchValue);

}
