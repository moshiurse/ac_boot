package com.project.accounting.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.accounting.model.OpeningBalance;

public interface OpeningBalanceRepository extends JpaRepository<OpeningBalance, Integer> {

	List<OpeningBalance> findByFinYearAndCompany(int finYear,int company);
}
