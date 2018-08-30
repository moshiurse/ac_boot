package com.project.accounting.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="finyear")
public class FinYear {

	@Id
	@Column(name="finyear_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int finYearId;
	
	@Column(name="finyear_no")
	private int finYearNo;
	
	
	@Column(name="company")
	private int company;
	
	@Column(name="start_date")
	private String finYearStartDate;
	
	@Column(name="end_date")
	private String finYearEndDate;
	
	@Column(name="created_by")
	private String createdBy;
	
	
	@Column(name="verified_by")
	private String verifiedBy;
	

	public int getFinYearId() {
		return finYearId;
	}

	public void setFinYearId(int finYearId) {
		this.finYearId = finYearId;
	}

	public int getFinYearNo() {
		return finYearNo;
	}

	public void setFinYearNo(int finYearNo) {
		this.finYearNo = finYearNo;
	}


	public int getCompany() {
		return company;
	}

	public void setCompany(int company) {
		this.company = company;
	}

	public String getFinYearStartDate() {
		return finYearStartDate;
	}

	public void setFinYearStartDate(String finYearStartDate) {
		this.finYearStartDate = finYearStartDate;
	}

	public String getFinYearEndDate() {
		return finYearEndDate;
	}

	public void setFinYearEndDate(String finYearEndDate) {
		this.finYearEndDate = finYearEndDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getVerifiedBy() {
		return verifiedBy;
	}

	public void setVerifiedBy(String verifiedBy) {
		this.verifiedBy = verifiedBy;
	}

	@Override
	public String toString() {
		return "FinYear [finYearId=" + finYearId + ", finYearNo=" + finYearNo + ", company=" + company
				+ ", finYearStartDate=" + finYearStartDate + ", finYearEndDate=" + finYearEndDate + ", createdBy="
				+ createdBy + ", verifiedBy=" + verifiedBy + "]";
	}

	
}
