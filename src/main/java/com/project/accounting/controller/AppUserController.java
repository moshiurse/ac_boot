package com.project.accounting.controller;

import com.project.accounting.model.Role;
import com.project.accounting.services.AppUserService;
import com.project.accounting.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.project.accounting.model.AppUser;

import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
@RequestMapping("/user")
public class AppUserController {
	
	@Autowired
	private AppUserService appUserService;

	@Autowired
	PasswordEncoder passwordEncoder;

	@Autowired
	private RoleService roleService;

	@Autowired
	HttpSession httpSession;
	
	@PostMapping("/save")
	@ResponseBody
	public String saveAdmin(@RequestBody AppUser appUser) {

		try {
			appUser.setEmail("rmoshiur@gmail.com");
			appUser.setPassword("11111");
			appUser.setFullName("A.H.M Moshiur Rahman");
			appUser.setUserName("moshiur");
			appUser.setPassword(passwordEncoder.encode(appUser.getPassword()));
			appUser.setEnabled(1);
			List<Role> roles = new ArrayList<>();
			Role role = roleService.findRoleByName("ROLE_ADMIN");
			roles.add(role);
			appUser.setRoles(roles);

			appUserService.saveUser(appUser);
			return "Successfully registered";
		} catch (Exception e) {
			e.printStackTrace();
			return "Error saving data "+appUser.getId();
		}

	}

	@GetMapping("/all")
	public @ResponseBody List<AppUser> getAllAppUserByCompany(){
		int company =1;
		return appUserService.showActiveUserBycompany(company);
	}
}
