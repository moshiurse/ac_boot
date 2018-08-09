package com.project.accounting.services;

import java.util.List;

import com.project.accounting.model.ChartOfAccount;

public interface ChartOfAccountService {
	
	ChartOfAccount saveCa(ChartOfAccount account);
	
	ChartOfAccount updateCa(ChartOfAccount account);
	
	void deleteCa(ChartOfAccount account);
	
	ChartOfAccount getCaById(int id);
	
	List<ChartOfAccount> getAllCa();
	
	
	
	

}
