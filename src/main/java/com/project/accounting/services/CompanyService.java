package com.project.accounting.services;

import com.project.accounting.model.Company;

public interface CompanyService {

	Company saveCompany(Company company);

	Company updateCompany(Company company);

	void deleteCompany(Company company);

}
