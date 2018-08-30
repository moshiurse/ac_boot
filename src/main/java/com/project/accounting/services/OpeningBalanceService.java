package com.project.accounting.services;

import java.util.List;

import com.project.accounting.model.OpeningBalance;

public interface OpeningBalanceService {

	OpeningBalance saveOpeningBalance(OpeningBalance balance);

	OpeningBalance updateOpeningBalance(OpeningBalance balance);

	void deleteOpeningBalance(OpeningBalance balance);

	List<OpeningBalance> getAllOpeningBalance();
	
	List<OpeningBalance> getOpeningBalanceByFinYearAndCompany(int finYear,int company);

}
