package com.project.accounting.services;

import java.util.List;
import java.util.Map;

public interface ReportService{
	
	//General Ledger
	
	List<Map<String, Object>> getLedger(
			int company, int finYear, String finStartDate, String startDate, String endDate);
	
	//Trial balance
	List<Map<String, Object>> getTrialBalance(
			int company, int finYear, String startDate, String endDate);

}
