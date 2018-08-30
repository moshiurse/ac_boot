package com.project.accounting.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="acc_users")
public class AppUser {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="user_id")
	private int id;
	
	@Column(name="fullname")
	private String fullName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="username")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="enabled")
	private boolean enable;
	
	@Column(name="created_by")
	private String createdBy;
	
	@OneToMany(cascade= CascadeType.ALL, fetch= FetchType.EAGER)
	@JoinTable(name="authority", joinColumns= @JoinColumn(name="user_id"))
	private Set<Authority> authorities;
	
	

	public AppUser() {
		
	}
	
	

	public AppUser(AppUser appUser) {
		this.email = appUser.getEmail();
		this.fullName = appUser.getFullName();
		this.enable = appUser.isEnable();
		this.password = appUser.getPassword();
		this.authorities = appUser.getAuthorities();
		this.userName = appUser.getUserName();
		this.createdBy =appUser.getCreatedBy();
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}	




	public String getCreatedBy() {
		return createdBy;
	}



	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}



	public Set<Authority> getAuthorities() {
		return authorities;
	}



	public void setAuthorities(Set<Authority> authorities) {
		this.authorities = authorities;
	}



	@Override
	public String toString() {
		return "AppUser [id=" + id + ", fullName=" + fullName + ", email=" + email + ", UserName=" + userName
				+ ", password=" + password + ", enable=" + enable + ", createdBy=" + createdBy + ", authorities="
				+ authorities + "]";
	}



}
