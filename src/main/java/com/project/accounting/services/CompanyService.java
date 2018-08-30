package com.project.accounting.services;

import java.util.List;

import com.project.accounting.model.Company;

public interface CompanyService {
	
	Company saveCompany(Company company);
	
	Company updateCompany(Company company);
	
	void deleteCompany(Company company);
	
	List<Company> getAllCompany();

}
