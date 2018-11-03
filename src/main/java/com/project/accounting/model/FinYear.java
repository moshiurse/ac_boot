package com.project.accounting.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="finyear")
public class FinYear {

	@Id
	@Column(name="finyear_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long finYearId;
	
	@Column(name="finyear_no")
	private int finYearNo;

	
	@Column(name="company")
	private int company;
	
	@Column(name="start_date")
	private Date startDate;
	
	@Column(name="end_date")
	private Date endDate;

	@Column(name = "enabled")
	private int enabled;
	
	@Column(name="created_by")
	private String createdBy;
	
	
	@Column(name="verified_by")
	private String verifiedBy;
	

	public Long getFinYearId() {
		return finYearId;
	}

	public void setFinYearId(Long finYearId) {
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

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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
	public String getVerifiedBy() {
		return verifiedBy;
	}

	public void setVerifiedBy(String verifiedBy) {
		this.verifiedBy = verifiedBy;
	}

	@Override
	public String toString() {
		return "FinYear [finYearId=" + finYearId + ", finYearNo=" + finYearNo + ", company=" + company
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", createdBy="
				+ createdBy + ", verifiedBy=" + verifiedBy + "]";
	}

	
}
