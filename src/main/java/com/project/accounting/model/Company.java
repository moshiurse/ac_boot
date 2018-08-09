package com.project.accounting.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "company")
public class Company {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="company_id")
	private int id;
	
	@Column(name="name")
	private String companyName;
	
	@Column(name="address")
	private String companyAddress;
	
	@Column(name="email")
	private String companyEmail;
	
	@Column(name="phone")
	private String companyPhone;
	
	@Column(name="fax")
	private String companyFax;
	
	@Column(name="note")
	private String companyNote;
	
	@Column(name="logo")
	private String companyLogo;
	
	@Column(name="web_site")
	private String companyWebsite;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getCompanyEmail() {
		return companyEmail;
	}

	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

	public String getCompanyPhone() {
		return companyPhone;
	}

	public void setCompanyPhone(String companyPhone) {
		this.companyPhone = companyPhone;
	}

	public String getCompanyFax() {
		return companyFax;
	}

	public void setCompanyFax(String companyFax) {
		this.companyFax = companyFax;
	}

	public String getCompanyNote() {
		return companyNote;
	}

	public void setCompanyNote(String companyNote) {
		this.companyNote = companyNote;
	}

	public String getCompanyLogo() {
		return companyLogo;
	}

	public void setCompanyLogo(String companyLogo) {
		this.companyLogo = companyLogo;
	}

	public String getCompanyWebsite() {
		return companyWebsite;
	}

	public void setCompanyWebsite(String companyWebsite) {
		this.companyWebsite = companyWebsite;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", companyName=" + companyName + ", companyAddress=" + companyAddress
				+ ", companyEmail=" + companyEmail + ", companyPhone=" + companyPhone + ", companyFax=" + companyFax
				+ ", companyNote=" + companyNote + ", companyLogo=" + companyLogo + ", companyWebsite=" + companyWebsite
				+ "]";
	}
	
	
	
	

}
