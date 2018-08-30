package com.project.accounting.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.accounting.model.ChartOfAccount;
import com.project.accounting.repository.ChartOfAccountRepository;
import com.project.accounting.services.ChartOfAccountService;

@Service
public class ChartOfAccountServiceImpl implements ChartOfAccountService{
	
	@Autowired
	ChartOfAccountRepository chartOfAccountRepository;

	@Override
	public ChartOfAccount saveCa(ChartOfAccount account) {

		return chartOfAccountRepository.save(account);
	}

	@Override
	public ChartOfAccount updateCa(ChartOfAccount account) {
		ChartOfAccount ca = chartOfAccountRepository.findById(account.getCaId()).get();
		return chartOfAccountRepository.save(ca);
	}

	@Override
	public void deleteCa(ChartOfAccount account) {
		ChartOfAccount ca =  chartOfAccountRepository.findById(account.getCaId()).get();
		chartOfAccountRepository.delete(ca);
	}

	@Override
	public ChartOfAccount getCaById(int id) {
		
		return chartOfAccountRepository.findById(id).get();
	}

	@Override
	public List<ChartOfAccount> getAllCa() {

		return chartOfAccountRepository.findAll();
	}

	@Override
	public List<ChartOfAccount> getAllCaByCompany(int company) {

		return chartOfAccountRepository.findByCompany(company);
	}



}
