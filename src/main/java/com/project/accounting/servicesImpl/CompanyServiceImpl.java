package com.project.accounting.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.accounting.model.Company;
import com.project.accounting.repository.CompanyRepository;
import com.project.accounting.services.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService{
	
	@Autowired
	CompanyRepository companyRepository;
	
	@Override
	public Company saveCompany(Company account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Company updateCompany(Company account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCompany(Company account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Company> getAllCompany() {
		// TODO Auto-generated method stub
		return companyRepository.findAll();
	}



}
