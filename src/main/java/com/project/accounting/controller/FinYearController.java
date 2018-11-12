package com.project.accounting.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.project.accounting.model.Company;
import com.project.accounting.model.FinYear;
import com.project.accounting.servicesImpl.FinYearServiceImpl;

import javax.servlet.http.HttpSession;

@Controller()
@RequestMapping("/fin")
public class FinYearController {

	@Autowired
	FinYearServiceImpl finYearService;

	@Autowired
	HttpSession httpSession;

	@PostMapping("/save")
	public @ResponseBody String saveFinYear(FinYear finYear) {

		try {
//			int company  = (Integer) httpSession.getAttribute("company");
//			finYear.setCompany(company);
			finYear.setEnabled(1);
			finYear.setFinYearNo(1222);
			String sDate="01/12/2018";
			String eDate="11/09/2018";
			Date startDate=new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
			Date endDate=new SimpleDateFormat("dd/MM/yyyy").parse(eDate);
			finYear.setStartDate(startDate);
			finYear.setEndDate(endDate);
			finYearService.saveFinYear(finYear);
			return "Financial Year saved successfully";
		} catch (Exception e) {
			e.printStackTrace();
			return "Error saving data";
		}
	}


	@GetMapping("/showAll/{company}")
	public @ResponseBody List<FinYear> showAllFinYearByCompany(@PathVariable("company") int company){

		return finYearService.showAllFinYearByCompany(company);
	}

	@GetMapping("/showAll")
	public @ResponseBody List<FinYear> showFinYear(){

		return finYearService.showAllFinYear();
	}

	@GetMapping("/showActive/{company}")
	public @ResponseBody List<FinYear> showActiveFinYearByCompany(@PathVariable("company") int company){

		return finYearService.showActiveFinYearByCompany(company);
	}

	@PostMapping("/disable/{id}")
	@ResponseBody public void deleteFinYear (@PathVariable("id") Long id){

		int company = 1;
		finYearService.disableFinYear(id, company);
	}

}
