package com.project.accounting.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "chartofaccount")
public class ChartOfAccount {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;

	@Column(name = "ca_id")
	private int caId;
	
	@Column(name= "code")
	private String caCode;

	@Column(name = "name")
	private String caName;


	@Column(name = "parent",nullable=true)
	private Integer caParent;
	
	@Column(name = "company_id")
	private int company;

	@Column(name = "enable")
	private int enable;

	@Column(name = "type")
	private int type;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_at")
	private Date createdAt;

	@Column(name = "verified_by")
	private String verifiedBy;

	@Column(name = "verified_at") 
	private Date verifiedAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public int getEnable() {
		return enable;
	}

	public void setEnable(int enable) {
		this.enable = enable;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
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
	return "ChartOfAccount{" +
			"id=" + id +
			", caId=" + caId +
			", caCode='" + caCode + '\'' +
			", caName='" + caName + '\'' +
			", caParent=" + caParent +
			", company=" + company +
			", enable=" + enable +
			", type=" + type +
			", createdBy='" + createdBy + '\'' +
			", createdAt=" + createdAt +
			", verifiedBy='" + verifiedBy + '\'' +
			", verifiedAt=" + verifiedAt +
			'}';
}


}
