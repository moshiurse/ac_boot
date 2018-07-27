package com.project.accounting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.accounting.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer>{

}
