package com.project.accounting.services;

import java.util.List;

import com.project.accounting.model.ChartOfAccount;

public interface ChartOfAccountService {
//	save ChartOfAccount
	ChartOfAccount saveCa(ChartOfAccount account);

//	Update ChartOfAccount
	ChartOfAccount updateCa(ChartOfAccount account);

//	Search ChartOfAccount by id
	ChartOfAccount getCaById(Long id);

//	Search All ChartOfAccount by id or Name
	List<ChartOfAccount> getAllCaByIdOrName(String search, int company);

//	Get All Active ChartOfAccount by company
	List<ChartOfAccount> getAllActiveCa(int company);

//	Get All ChartOfAccount by Company
	List<ChartOfAccount> getAllCaByCompany(int company);

//	Get All ca of whole domain
	List<ChartOfAccount> getAllCaOfDomain();

//	Delete/Disable ChartOfAccount
	void disableCa(Long id, int company);

//	Find By Id
	ChartOfAccount findById(ChartOfAccount id);
	


}
