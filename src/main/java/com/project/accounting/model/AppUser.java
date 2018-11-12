package com.project.accounting.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "users")
public class AppUser implements Serializable {

private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "user_id")
private Long id;

@Column(name = "fullname")
private String fullName;

@Column(name = "email")
private String email;

@Column(name = "username")
private String userName;

@Column(name = "password")
private String password;

@Column(name = "company")
private Integer company;

@Column(name = "enabled")
private int enabled;

@Column(name = "created_by")
private String createdBy;

@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
@JoinTable(name = "authorities", joinColumns = {
		@JoinColumn(name = "user_name", referencedColumnName = "username"),
}, inverseJoinColumns = {
		@JoinColumn(name = "role_name", referencedColumnName = "name")
})
private List<Role> roles;


public AppUser() {

}

public AppUser(String fullName, String email, String userName, String password,
			   Integer company, int enabled, String createdBy) {
	this.fullName = fullName;
	this.email = email;
	this.userName = userName;
	this.password = password;
	this.company = company;
	this.enabled = enabled;
	this.createdBy = createdBy;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
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

public Integer getCompany() {
	return company;
}

public void setCompany(Integer company) {
	this.company = company;
}

public int getEnabled() {
	return enabled;
}

public void setEnabled(int enabled) {
	this.enabled = enabled;
}

public String getCreatedBy() {
	return createdBy;
}

public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
}

public List<Role> getRoles() {
	return roles;
}

public void setRoles(List<Role> roles) {
	this.roles = roles;
}

@Override
public String toString() {
	return "AppUser{" +
			"fullName='" + fullName + '\'' +
			", email='" + email + '\'' +
			", userName='" + userName + '\'' +
			", password='" + password + '\'' +
			", company=" + company +
			", enabled=" + enabled +
			", createdBy='" + createdBy + '\'' +
			", roles=" + roles +
			'}';
}

}
