package com.project.accounting.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="acc_bank_info")
public class BankInfo {
	
	@Id
	@Column(name ="bank_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name ="name")
	private String bankName;
	
	@Column(name ="short_name")
	private String bankShortName;
	
	@Column(name ="contact")
	private String bankContact;
	
	@Column(name ="email")
	private String bankEmail;
	
	@Column(name ="faxno")
	private String bankFaxNo;
	
	@Column(name ="web_url")
	private String bankUrl;
	
	@Column(name ="created_by")
	private String createdBy;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankShortName() {
		return bankShortName;
	}

	public void setBankShortName(String bankShortName) {
		this.bankShortName = bankShortName;
	}

	public String getBankContact() {
		return bankContact;
	}

	public void setBankContact(String bankContact) {
		this.bankContact = bankContact;
	}

	public String getBankEmail() {
		return bankEmail;
	}

	public void setBankEmail(String bankEmail) {
		this.bankEmail = bankEmail;
	}

	public String getBankFaxNo() {
		return bankFaxNo;
	}

	public void setBankFaxNo(String bankFaxNo) {
		this.bankFaxNo = bankFaxNo;
	}

	public String getBankUrl() {
		return bankUrl;
	}

	public void setBankUrl(String bankUrl) {
		this.bankUrl = bankUrl;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	public String toString() {
		return "BankInfo [id=" + id + ", bankName=" + bankName + ", bankShortName=" + bankShortName + ", bankContact="
				+ bankContact + ", bankEmail=" + bankEmail + ", bankFaxNo=" + bankFaxNo + ", bankUrl=" + bankUrl
				+ ", createdBy=" + createdBy + "]";
	}

	
	

}
