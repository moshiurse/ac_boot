package com.project.accounting.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.accounting.model.FinYear;
import com.project.accounting.repository.FinYearRepository;
import com.project.accounting.services.FinYearService;

@Service
public class FinYearServiceImpl implements FinYearService{
	
	@Autowired
	FinYearRepository finYearRepository;

	@Override
	public FinYear saveFinYear(FinYear finYear) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FinYear updateFinYear(FinYear finYear) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteFinYear(FinYear finYear) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<FinYear> getAllFinYear() {
		// TODO Auto-generated method stub
		return finYearRepository.findAll();
	}

	@Override
	public List<FinYear> getFinYearByCompanyId(int companyId) {
		
		return finYearRepository.findByCompanyId(companyId);
	}

}
