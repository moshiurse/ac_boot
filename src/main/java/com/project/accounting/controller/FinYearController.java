package com.project.accounting.controller;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.accounting.model.Company;
import com.project.accounting.model.FinYear;
import com.project.accounting.servicesImpl.FinYearServiceImpl;

@Controller
public class FinYearController {
	
	FinYearServiceImpl finYearService;
	
	@PostMapping("/showFinYear/{company}")
	public @ResponseBody List<FinYear> showFinYearByCompany(@PathVariable ("company") int company){
		
		return finYearService.getFinYearByCompany(1);
	}
	
	@PostMapping("/showFinYear")
	public @ResponseBody List<FinYear> showFinYear(){
		
		return finYearService.getAllFinYear();
	}

}
