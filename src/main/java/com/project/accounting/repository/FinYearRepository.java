package com.project.accounting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.accounting.model.FinYear;

public interface FinYearRepository extends JpaRepository<FinYear, Integer> {

}
