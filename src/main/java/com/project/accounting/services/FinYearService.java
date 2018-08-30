package com.project.accounting.services;

import java.util.List;

import com.project.accounting.model.Company;
import com.project.accounting.model.FinYear;

public interface FinYearService {
	
	FinYear saveFinYear(FinYear finYear);

	FinYear updateFinYear(FinYear finYear);

	void deleteFinYear(FinYear finYear);

	List<FinYear> getAllFinYear();
	
	List<FinYear> getFinYearByCompany(int company);

}
