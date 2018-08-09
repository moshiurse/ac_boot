package com.project.accounting.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="acc_fin_year")
public class FinYear {

	@Id
	@Column(name="fy_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int finYearId;
	
	@Column(name="fy_no")
	private int finYearNo;
	
	@Column(name="comid")
	private int companyId;
	
	@Column(name="start_dt")
	private String finYearStartDate;
	
	@Column(name="end_date")
	private String finYearEndDate;
	
	@Column(name="created_by")
	private String createdBy;

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



	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
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

	
	@Override
	public String toString() {
		return "FinYear [finYearId=" + finYearId + ", finYearNo=" + finYearNo + ", companyId=" + companyId
				+ ", finYearStartDate=" + finYearStartDate + ", finYearEndDate=" + finYearEndDate + ", createdBy="
				+ createdBy + "]";
	}	
	
}
