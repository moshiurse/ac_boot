package com.project.accounting.services;

import com.project.accounting.model.Role;

import java.util.List;

/**
 * Created by Moshiur on 11/6/2018.
 */
public interface RoleService {

	Role findRoleByName(String role);

	List<Role> getAllRole();
}
