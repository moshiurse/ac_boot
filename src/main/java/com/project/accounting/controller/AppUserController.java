package com.project.accounting.controller;

import com.project.accounting.model.Authority;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.accounting.model.AppUser;
import com.project.accounting.servicesImpl.AppUserServiceImpl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

@Controller
public class AppUserController {
	
	@Autowired
	private AppUserServiceImpl appUserService;
	
	@RequestMapping("/saveuser")
	public String saveUser(AppUser user) {
		user.setEnable(true);
		Authority authority = new Authority(user.getId(), 2, 1);
		appUserService.saveUser(user);
		return "user saved!";
	}

}
