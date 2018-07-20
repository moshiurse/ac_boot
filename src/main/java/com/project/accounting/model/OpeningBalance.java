package com.project.accounting.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="acc_opening_balance")
public class OpeningBalance {
	
	@Id
	@Column(name="ob_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="fy_id")
	private int finYearId;
	
	@Column(name="ca_id")
	private String caId;
	
	@Column(name="project")
	private String project;
	
	@Column(name="debit")
	private double debit;
	
	@Column(name="credit")
	private double credit;
	
	@Column(name="currency")
	private String currency;
	
	@Column(name="company_id")
	private int companyId;
	
	@Column(name="created_by")
	private String createdBy;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFinYearId() {
		return finYearId;
	}

	public void setFinYearId(int finYearId) {
		this.finYearId = finYearId;
	}

	public String getCaId() {
		return caId;
	}

	public void setCaId(String caId) {
		this.caId = caId;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public double getDebit() {
		return debit;
	}

	public void setDebit(double debit) {
		this.debit = debit;
	}

	public double getCredit() {
		return credit;
	}

	public void setCredit(double credit) {
		this.credit = credit;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	public String toString() {
		return "OpeningBalance [id=" + id + ", finYearId=" + finYearId + ", caId=" + caId + ", project=" + project
				+ ", debit=" + debit + ", credit=" + credit + ", currency=" + currency + ", companyId=" + companyId
				+ ", createdBy=" + createdBy + "]";
	}
	
	
	

}
