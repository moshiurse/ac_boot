package com.project.accounting.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="role")
public class Role implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="role_id")
	int roleId;
	
	@Column(name="name")
	String roleName;
	
	@Column(name="level")
	int roleLevel;

	@ManyToMany(mappedBy = "roles")
	List<AppUser> appUsers;

	public Role() {
		
	}

public Role(int roleId, String roleName, int roleLevel) {
	this.roleId = roleId;
	this.roleName = roleName;
	this.roleLevel = roleLevel;
}

public Role(String roleName, int roleLevel, List<AppUser> appUsers) {
	this.roleName = roleName;
	this.roleLevel = roleLevel;
	this.appUsers = appUsers;
}

public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
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

	public List<AppUser> getAppUsers() {
		return appUsers;
	}

	public void setAppUsers(List<AppUser> appUsers) {
		this.appUsers = appUsers;
	}

@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName + ", roleLevel=" + roleLevel + "]";
	}
	
	

}
