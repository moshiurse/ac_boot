package com.project.accounting.services;

import java.util.List;

import com.project.accounting.model.Company;

public interface CompanyService {
	
	Company saveCompany(Company account);
	
	Company updateCompany(Company account);
	
	void deleteCompany(Company account);
	
	List<Company> getAllCompany();

}
