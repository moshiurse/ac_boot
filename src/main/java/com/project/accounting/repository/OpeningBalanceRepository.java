package com.project.accounting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.accounting.model.OpeningBalance;

public interface OpeningBalanceRepository extends JpaRepository<OpeningBalance, Integer> {

}
