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
	
	@RequestMapping("/registration")
	public String showRegistration() {
		
		return "registration";
	}
	
	@RequestMapping("/crcompany")
	public String showCreateCompany() {
		
		return "crcompany";
	}
	
	@RequestMapping("/employee")
	public String showEmployee() {
		
		return "employee";
	}
	
	@RequestMapping("/crfinyear")
	public String showCreateFinancialYear() {
		
		return "crfinyear";
	}
	
	@RequestMapping("/cropbalance")
	public String showCreateOpeningBalance() {
		
		return "cropbalance";
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

}
