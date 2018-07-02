package com.project.accounting.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class ViewPagesController {
	
	@RequestMapping("/login")
	public String showLogin() {
		
		return "login";
	}
	
	@RequestMapping("/register")
	public String showRegistration() {
		
		return "register";
	}

}
