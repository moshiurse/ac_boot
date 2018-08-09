package com.project.accounting.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="authorities")
public class Authority implements Serializable{
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="authority_id")
	private int id;
	
	@Id
	@Column(name="user_id")
	private int userId;
	
	@Id
	@Column(name="role_id")
	private int roleId;
	
	@Id
	@Column(name="company_id")
	private int company_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public int getCompany_id() {
		return company_id;
	}

	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}

	@Override
	public String toString() {
		return "Authority [id=" + id + ", userId=" + userId + ", roleId=" + roleId + ", company_id=" + company_id + "]";
	}

	
}
