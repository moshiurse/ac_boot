package com.project.accounting.controller;

import java.util.List;

import com.project.accounting.services.ChartOfAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.project.accounting.model.ChartOfAccount;
import com.project.accounting.servicesImpl.ChartOfAccountServiceImpl;

@Controller
public class ChartOfAccountController {
	
	@Autowired
	ChartOfAccountService chartOfAccountservice;
	
	@RequestMapping(value="/showChartOfAccount", method=RequestMethod.POST)
	public @ResponseBody List<ChartOfAccount> showChartOfAccount() {
		
		
		try {
			int company = 1;
			List<ChartOfAccount> show = chartOfAccountservice.getAllCaByCompany(company);
			System.out.println("showChartOfAccount...." + show.toString());
			return show;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@RequestMapping(value="/showActiveChartOfAccount", method=RequestMethod.POST)
	public @ResponseBody List<ChartOfAccount> showActiveChartOfAccount() {


		try {
			System.out.println("calling showActiveChartOfAccount....");
			int company = 1;
			List<ChartOfAccount> show = chartOfAccountservice.getAllActiveCa(company);
			System.out.println("showActiveChartOfAccount...." + show.toString());
			return show;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@RequestMapping(value= "/saveCa", method= RequestMethod.POST)
	@ResponseBody public String saveChartOfAccount(ChartOfAccount ca) {
		try {
			ca.setCaId(1200);
			ca.setCaName("Asset Expensee");
			ca.setCaParent(1000);
			ca.setCompany(1);
			ca.setEnable(1);
			ca.setType(2);
			chartOfAccountservice.saveCa(ca);
			System.out.println("saved" + ca.toString());
			return "Record Inserted Successfully";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Error Inserting ChartOfAccount" + ca.getCaId();
		}
	}
	
//	@RequestMapping(value="/showCaByCompany/company/{company}", method= RequestMethod.POST)
//	public @ResponseBody List<ChartOfAccount> showCaByCompany(@PathVariable int company){
//		System.out.println(chartOfAccountservice.getAllCaByCompany(company));
//		return chartOfAccountservice.getAllCaByCompany(company);
//	}
	
	@RequestMapping(value="/deleteCa/{id}", method=RequestMethod.POST)
	public void deleteCa(@PathVariable Long id) {
		try {
			ChartOfAccount ca = new ChartOfAccount();
			ca.setId(id);
			chartOfAccountservice.disableCa(id);
			System.out.println("Deleted Successfully! Id= "+ca.getCaCode()+ ca.getCaId() + "Name : "+ ca.getCaName());
			chartOfAccountservice.getAllActiveCa(ca.getCompany());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	@RequestMapping(value = "/caSearch" , method = RequestMethod.GET)
	public List<ChartOfAccount> getAllCaByIdOrName(@RequestParam("search") String search){

		try {
			int company = 1;
			System.out.println("Searching with "+search);
			return chartOfAccountservice.getAllCaByIdOrName(search, company);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}



}
