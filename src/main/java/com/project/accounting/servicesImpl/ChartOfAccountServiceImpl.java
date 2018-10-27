package com.project.accounting.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
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
		ChartOfAccount ca = chartOfAccountRepository.findById(account.getId()).get();
		return chartOfAccountRepository.save(ca);
	}


	@Override
	public ChartOfAccount getCaById(Long id) {
		
		return chartOfAccountRepository.findById(id).get();
	}

	@Override
	public List<ChartOfAccount> getAllCaByIdOrName(String search, int company) {
		return chartOfAccountRepository.findCaByIdOrName(search, company);
	}

	@Override
	public List<ChartOfAccount> getAllActiveCa(int company) {
		return chartOfAccountRepository.showAllActiveCa(company);
	}


	@Override
	public List<ChartOfAccount> getAllCaByCompany(int company) {

		return chartOfAccountRepository.findByCompany(company);
	}


	@Override
	public void disableCa(Long id, int company) {

		chartOfAccountRepository.disableCa(id, company);
	}

@Override
public ChartOfAccount findById(ChartOfAccount id) {
	return chartOfAccountRepository.findById(id);
}


@Override
	public List<ChartOfAccount> getAllCaOfDomain() {

		return chartOfAccountRepository.findAll();
	}


}
