package com.project.accounting.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="acc_role")
public class UserRole {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name= "role_id")
	private int id;
	
	@Column(name="role_name")
	private String roleName;
	
	@Column(name="role_level")
	private int roleLevel;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public int getRoleLevel() {
		return roleLevel;
	}

	public void setRoleLevel(int roleLevel) {
		this.roleLevel = roleLevel;
	}

	@Override
	public String toString() {
		return "UserRole [id=" + id + ", roleName=" + roleName + ", roleLevel=" + roleLevel + "]";
	}
	
	
}
