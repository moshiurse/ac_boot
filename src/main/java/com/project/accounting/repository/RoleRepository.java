package com.project.accounting.repository;

import com.project.accounting.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Moshiur on 11/6/2018.
 */
public interface RoleRepository extends JpaRepository<Role, Integer>{

	Role findByRoleName(String roleName);
}
