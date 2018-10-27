package com.project.accounting.controller;

import java.util.List;

import com.project.accounting.services.ChartOfAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.project.accounting.model.ChartOfAccount;
import com.project.accounting.servicesImpl.ChartOfAccountServiceImpl;

@Controller
@RequestMapping("/ca")
public class ChartOfAccountController {
	
	@Autowired
	ChartOfAccountService chartOfAccountservice;

	/*
	Method for All Chart Of Account
	 */
	@RequestMapping(value="/showAll", method=RequestMethod.POST)
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

	/*
	Controller Method for show Active ChartOfAccount
	 */
	@RequestMapping(value="/showActive", method=RequestMethod.POST)
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

	/*
	Controller method for Insert Chart Of Account in database
	 */
	@RequestMapping(value= "/save", method= RequestMethod.POST)
	@ResponseBody public String saveChartOfAccount(@RequestBody ChartOfAccount ca) {
		try {
			ca.setCompany(1);
//			ca.setEnable(1);
			chartOfAccountservice.saveCa(ca);
			System.out.println("saved" + ca.toString());
//			showActiveChartOfAccount();
			return "Record Inserted Successfully";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Error Inserting ChartOfAccount" + ca.getCaId();
		}
	}

	/*
	Controller method for delete ChartOfAccount from database of a company
	 */
	@RequestMapping(value="/delete/{id}", method=RequestMethod.POST)
	@ResponseBody public void deleteCa(@PathVariable Long id) {
		try {
			int company = 1;
			chartOfAccountservice.disableCa(id, company);
			System.out.println("Deleted Successfully! Id= " + id);
			chartOfAccountservice.getAllActiveCa(company);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error deleting ca");
		}
	}

	/*
	Search Chart Of Account
	 */
	@RequestMapping(value = "/search/search" , method = RequestMethod.GET)
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

//	@RequestMapping(value = "/findById/{id}")
//	public ChartOfAccount findById(@PathVariable ChartOfAccount id){
//
//		return chartOfAccountservice.findById(id);
//	}



}
