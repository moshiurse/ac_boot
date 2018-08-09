package com.project.accounting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.accounting.model.ChartOfAccount;
import com.project.accounting.servicesImpl.ChartOfAccountServiceImpl;

@Controller
public class ChartOfAccountController {
	
	@Autowired
	ChartOfAccountServiceImpl service;
	
	@RequestMapping(value="/showChartOfAccount", method=RequestMethod.POST)
	public @ResponseBody List<ChartOfAccount> showChartOfAccount() {
		System.out.println(service.getAllCa());
		return service.getAllCa();
	}
	
	@RequestMapping(value= "/saveCa", method= RequestMethod.POST)
	public String saveChartOfAccount(ChartOfAccount ca) {
		
		service.saveCa(ca);
		System.out.println("saved" + ca.toString());
		return null;
	}

}
