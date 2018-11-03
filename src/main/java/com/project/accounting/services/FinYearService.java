package com.project.accounting.services;

import java.util.List;

import com.project.accounting.model.Company;
import com.project.accounting.model.FinYear;

public interface FinYearService {
	
	FinYear saveFinYear(FinYear finYear);

	FinYear updateFinYear(FinYear finYear);

	void disableFinYear(Long id, int company);

	List<FinYear> showActiveFinYearByCompany(int company);
	
	List<FinYear> showAllFinYearByCompany(int company);

	List<FinYear> showAllFinYear();


}
