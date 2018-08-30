package com.project.accounting.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.accounting.model.ChartOfAccount;

public interface ChartOfAccountRepository extends JpaRepository<ChartOfAccount, Integer> {

	List<ChartOfAccount> findByCompany(int company);
}
