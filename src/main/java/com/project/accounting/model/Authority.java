package com.project.accounting.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="acc_authorities")
public class Authority implements Serializable{
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="authority_id")
	private int id;
	
	@Id
	@Column(name="username")
	private String userName;
	
	@Id
	@Column(name="authority")
	private String authority;
	
	@Id
	@Column(name="company")
	private int company;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public int getCompany() {
		return company;
	}

	public void setCompany(int company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Authority [id=" + id + ", userName=" + userName + ", authority=" + authority + ", company=" + company
				+ "]";
	}
	
	
	

}
