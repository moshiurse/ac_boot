package com.project.accounting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.accounting.model.ChartOfAccount;

public interface ChartOfAccountRepository extends JpaRepository<ChartOfAccount, Integer> {

}
