package com.project.accounting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.accounting.model.ChartOfAccount;
import com.project.accounting.servicesImpl.ChartOfAccountServiceImpl;

@Controller
public class ChartOfAccountController {
	
	@Autowired
	ChartOfAccountServiceImpl chartOfAccountservice;
	
	@RequestMapping(value="/showChartOfAccount", method=RequestMethod.POST)
	public @ResponseBody List<ChartOfAccount> showChartOfAccount() {
		
		
		try {
			System.out.println("calling showChartOfAccount....");
			return chartOfAccountservice.getAllCa();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	@RequestMapping(value= "/saveCa", method= RequestMethod.POST)
	public String saveChartOfAccount(ChartOfAccount ca) {
		try {
			ca.setCompany(1);
			chartOfAccountservice.saveCa(ca);
			System.out.println("saved" + ca.toString());
			return "Record Inserted Successfully";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	@RequestMapping(value="/showCaByCompany/company/{company}", method= RequestMethod.POST)
	public @ResponseBody List<ChartOfAccount> showCaByCompany(@PathVariable int company){
		System.out.println(chartOfAccountservice.getAllCaByCompany(company));
		return chartOfAccountservice.getAllCaByCompany(company);
	}
	
	@RequestMapping(value="/deleteCa/{id}", method=RequestMethod.POST)
	public void deleteCa(@PathVariable int id) {
		ChartOfAccount ca = new ChartOfAccount();
		ca.setCaId(id);
		chartOfAccountservice.deleteCa(ca);
		System.out.println("Deleted Successfully! Id= "+ ca.getCaId());
	}

}
