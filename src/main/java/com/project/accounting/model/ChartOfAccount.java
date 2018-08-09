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
	private String caId;
	
	@Column(name= "code")
	private String caCode;

	@Column(name = "name")
	private String caName;

	@Column(name = "company_id")
	private int cacomId;

	@Column(name = "parent")
	private String caParent;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_at")
	private Date createdAt;

	@Column(name = "verified_by")
	private String verifiedBy;

	@Column(name = "verified_at")
	private Date verifiedAt;

	public String getCaId() {
		return caId;
	}

	public void setCaId(String caId) {
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

	public int getCacomId() {
		return cacomId;
	}

	public void setCacomId(int cacomId) {
		this.cacomId = cacomId;
	}

	public String getCaParent() {
		return caParent;
	}

	public void setCaParent(String caParent) {
		this.caParent = caParent;
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
		return "ChartOfAccount [caId=" + caId + ", caCode=" + caCode + ", caName=" + caName + ", cacomId=" + cacomId
				+ ", caParent=" + caParent + ", createdBy=" + createdBy + ", createdAt=" + createdAt + ", verifiedBy="
				+ verifiedBy + ", verifiedAt=" + verifiedAt + "]";
	}

	
	

}
