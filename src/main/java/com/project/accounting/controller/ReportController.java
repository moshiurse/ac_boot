package com.project.accounting.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.accounting.servicesImpl.ReportServiceImpl;

@Controller
@CrossOrigin
@RequestMapping("/report")
public class ReportController {

	@Autowired
	ReportServiceImpl reportServiceImpl;
	
	@PostMapping("/trialbalance")
	public @ResponseBody 
	Map <String , Object> showTrialBalance() {
		
		Map<String, Object> map = new HashMap<>();
		
		map.put("data", reportServiceImpl.getTrialBalance(1, 1, "2018-08-01", "2018-08-31"));
		System.out.println(map);
		return map;
	}
	
	
	@PostMapping("/ledger")
	public @ResponseBody Map<String, Object> showLedger(){
		
		Map<String, Object> map = new HashMap<>();
		
		map.put("data", reportServiceImpl.getLedger(1, 1, "2018-06-01", "2018-08-01", "2018-08-31"));
		
		return map;
	}
	
	
		
	}
	
	
