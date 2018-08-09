package com.project.accounting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.accounting.model.Company;
import com.project.accounting.servicesImpl.CompanyServiceImpl;

@Controller
public class CompanyController {

	@Autowired
	CompanyServiceImpl companyServiceImpl;
	
	@RequestMapping(value="/showCompany", method=RequestMethod.POST)
	public @ResponseBody List<Company> showCompany(){
		
		return companyServiceImpl.getAllCompany();
	}
}
