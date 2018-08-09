package com.project.accounting.servicesImpl;

import java.util.List;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ChartOfAccount updateCa(ChartOfAccount account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCa(ChartOfAccount account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ChartOfAccount getCaById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ChartOfAccount> getAllCa() {
		// TODO Auto-generated method stub
		return chartOfAccountRepository.findAll();
	}



}
