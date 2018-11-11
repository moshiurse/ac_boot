package com.project.accounting.servicesImpl;

import com.project.accounting.model.Role;
import com.project.accounting.repository.RoleRepository;
import com.project.accounting.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Moshiur on 11/6/2018.
 */
@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	RoleRepository roleRepository;

	@Override
	public Role findRoleByName(String role) {
		return roleRepository.findByRoleName(role);

	}

	@Override
	public List<Role> getAllRole() {
		return roleRepository.findAll();
	}


}
