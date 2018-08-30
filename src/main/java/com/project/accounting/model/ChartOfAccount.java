package com.project.accounting.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "chartofaccount")
public class ChartOfAccount {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "chartofaccount_id")
	private int caId;
	
	@Column(name= "code")
	private String caCode;

	@Column(name = "name")
	private String caName;


	@Column(name = "parent",nullable=true)
	private Integer caParent;
	
	@Column(name = "company_id")
	private int company;
	

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_at")
	private Date createdAt;

	@Column(name = "verified_by")
	private String verifiedBy;

	@Column(name = "verified_at") 
	private Date verifiedAt;

	
	public int getCaId() {
		return caId;
	}


	public void setCaId(int caId) {
		this.caId = caId;
	}


	public String getCaCode() {
		return caCode;
	}


	public void setCaCode(String caCode) {
		this.caCode = caCode;
	}


	public String getCaName() {
		return caName;
	}


	public void setCaName(String caName) {
		this.caName = caName;
	}


	public Integer getCaParent() {
		return caParent;
	}


	public void setCaParent(Integer caParent) {
		this.caParent = caParent;
	}


	public int getCompany() {
		return company;
	}


	public void setCompany(int company) {
		this.company = company;
	}


	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}


	public String getVerifiedBy() {
		return verifiedBy;
	}


	public void setVerifiedBy(String verifiedBy) {
		this.verifiedBy = verifiedBy;
	}


	public Date getVerifiedAt() {
		return verifiedAt;
	}


	public void setVerifiedAt(Date verifiedAt) {
		this.verifiedAt = verifiedAt;
	}


	@Override
	public String toString() {
		return "ChartOfAccount [caId=" + caId + ", caCode=" + caCode + ", caName=" + caName + ", caParent=" + caParent
				+ ", company=" + company + ", createdBy=" + createdBy + ", createdAt=" + createdAt + ", verifiedBy="
				+ verifiedBy + ", verifiedAt=" + verifiedAt + "]";
	}


	

}
