package com.project.accounting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.project.accounting.model.Company;
import com.project.accounting.model.FinYear;
import com.project.accounting.servicesImpl.FinYearServiceImpl;

@Controller()
public class FinYearController {

	@Autowired
	FinYearServiceImpl finYearService;

	@PostMapping("/saveFinYear")
	public @ResponseBody String saveFinYear(FinYear finYear) {

		try {
			finYearService.saveFinYear(finYear);
			return "Financial Year saved successfully";
		} catch (Exception e) {
			e.printStackTrace();
			return "Error saving data";
		}
	}

	@PostMapping("/updateFinYear")
	public void updateFinYear(FinYear finYear){

		finYearService.saveFinYear(finYear);
		System.out.println("Update Fin Year");
	}

	@GetMapping("/showFinYear/{company}")
	public @ResponseBody List<FinYear> showFinYearByCompany(@PathVariable ("company") int company){

		return finYearService.getFinYearByCompany(1);
	}

	@PostMapping("/showFinYear")
	public @ResponseBody List<FinYear> showFinYear(){

		return finYearService.getAllFinYear();
	}

	@PostMapping("/deleteFinYear")
	public void deleteFinYear (FinYear finYear){

		finYearService.deleteFinYear(finYear);
	}

}
