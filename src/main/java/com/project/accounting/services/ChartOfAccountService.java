package com.project.accounting.services;

import java.util.List;

import com.project.accounting.model.ChartOfAccount;

public interface ChartOfAccountService {

	ChartOfAccount saveCa(ChartOfAccount ca);

	ChartOfAccount updateCa(ChartOfAccount ca);

	void deleteCa(ChartOfAccount ca);

	ChartOfAccount getCaById(int id);

	List<ChartOfAccount> getAllCa();

}
