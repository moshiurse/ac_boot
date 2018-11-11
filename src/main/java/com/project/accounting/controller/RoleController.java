package com.project.accounting.controller;

import com.project.accounting.model.Role;
import com.project.accounting.repository.RoleRepository;
import com.project.accounting.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Moshiur on 11/8/2018.
 */

@Controller
@RequestMapping("/roles")
public class RoleController {

	@Autowired
	RoleService roleService;

	@GetMapping("/")
	public @ResponseBody List<Role> getAllRole(){

		return roleService.getAllRole();
	}

	@GetMapping("/{name}")
	public @ResponseBody Role getRoleByName(@RequestParam String name){

		Role role = roleService.findRoleByName(name);
		if (role != null){
			return role;
		}else{
			return null;
		}

	}
}
