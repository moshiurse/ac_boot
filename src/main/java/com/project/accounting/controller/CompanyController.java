package com.project.accounting.controller;

import java.util.List;
import java.util.Optional;

import com.project.accounting.model.AppUser;
import com.project.accounting.services.AppUserService;
import com.project.accounting.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.project.accounting.model.Company;
import com.project.accounting.servicesImpl.CompanyServiceImpl;

@Controller
@RequestMapping("/company")
public class CompanyController {

@Autowired
CompanyService companyService;

@Autowired
AppUserService appUserService;

@PostMapping("/save")
public @ResponseBody
String createCompany(@RequestBody Company company) {
	company.setEnabled(1);
//	Optional<AppUser> user = appUserService.findById(1L);
	companyService.saveCompany(company);
//	appUserService.addCompanyToUser(user.get().getId(), company.getId());
	return "Successful";
}

@GetMapping("/show")
public @ResponseBody
List<Company> showCompany() {

	return companyService.getAllCompany();
}
}
