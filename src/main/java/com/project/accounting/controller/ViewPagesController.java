package com.project.accounting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewPagesController {
	

	@RequestMapping("/")
	public String showHome() {
		
		return "home";
	}
	
	@RequestMapping("/login")
	public String showLogin() {
		
		return "login";
	}

	@RequestMapping("/logout")
	public String showLogout() {

	return "logout";
	}
	
	@RequestMapping("/registration")
	public String showRegistration() {
		
		return "registration";
	}
	
	@RequestMapping("/company")
	public String showCreateCompany() {
		
		return "company";
	}
	
	@RequestMapping("/employee")
	public String showEmployee() {
		
		return "employee";
	}
	
	@RequestMapping("/finyear")
	public String showCreateFinancialYear() {
		
		return "finyear";
	}
	
	@RequestMapping("/opbalance")
	public String showCreateOpeningBalance() {
		
		return "opbalance";
	}
	
	@RequestMapping("/journal")
	public String showJornalEntry() {
		
		return "journal";
	}
	
	@RequestMapping("/trialbalance")
	public String showTrialBalance() {
		
		return "trialbalance";
	}
	
	@RequestMapping("/ledger")
	public String showLedger() {
		
		return "ledger";
	}
	
	@RequestMapping("/chartofaccount")
	public String showChartOfAccount() {
		
		return "chartofaccount";
	}
	
	@RequestMapping("/voucher")
	public String showVoucher() {
		
		return "voucher";
	}
	
	@RequestMapping("/pdftest")
	public String showPdfTest() {
		
		return "pdftest";
	}

}
