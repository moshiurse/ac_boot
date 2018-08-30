package com.project.accounting.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.accounting.model.OpeningBalance;
import com.project.accounting.repository.OpeningBalanceRepository;
import com.project.accounting.services.OpeningBalanceService;

@Service
public class OpeningBalanceServiceImpl implements OpeningBalanceService {
	
	@Autowired
	OpeningBalanceRepository openingBalanceRepository;

	@Override
	public OpeningBalance saveOpeningBalance(OpeningBalance balance) {
		// TODO Auto-generated method stub
		return openingBalanceRepository.save(balance);
	}

	@Override
	public OpeningBalance updateOpeningBalance(OpeningBalance balance) {

		balance = openingBalanceRepository.findById(balance.getId()).get();
		return openingBalanceRepository.save(balance);
	}

	@Override
	public void deleteOpeningBalance(OpeningBalance balance) {
		balance = openingBalanceRepository.findById(balance.getId()).get();
		openingBalanceRepository.delete(balance);

	}

	@Override
	public List<OpeningBalance> getAllOpeningBalance() {
		// TODO Auto-generated method stub
		return openingBalanceRepository.findAll();
	}

	@Override
	public List<OpeningBalance> getOpeningBalanceByFinYearAndCompany(int finYear, int company) {
		
		return openingBalanceRepository.findByFinYearAndCompany(finYear, company);
	}

}
