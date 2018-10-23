package com.project.accounting.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.accounting.model.Company;
import com.project.accounting.model.FinYear;
import com.project.accounting.repository.FinYearRepository;
import com.project.accounting.services.FinYearService;

@Service
public class FinYearServiceImpl implements FinYearService{
	
	@Autowired
	FinYearRepository finYearRepository;

	@Override
	public FinYear saveFinYear(FinYear finYear) {
		return finYearRepository.save(finYear);
	}

	@Override
	public FinYear updateFinYear(FinYear finYear) {
		finYear= finYearRepository.findById(finYear.getFinYearId()).get();
		return finYearRepository.save(finYear);
	}

	@Override
	public void deleteFinYear(FinYear finYear) {

		finYear= finYearRepository.findById(finYear.getFinYearId()).get();
		finYearRepository.delete(finYear);
	}

	@Override
	public List<FinYear> getAllFinYear() {

		return finYearRepository.findAll();
	}

	@Override
	public List<FinYear> getFinYearByCompany(int company) {
		
		return finYearRepository.findByCompany(company);
	}

}
