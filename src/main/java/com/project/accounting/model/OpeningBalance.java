package com.project.accounting.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="opening_balance")
public class OpeningBalance {
	
	@Id
	@Column(name="opening_balance_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="finyear_id")
	private int finYear;
	
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
	private int company;
	
	@Column(name="created_by")
	private String createdBy;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFinYear() {
		return finYear;
	}

	public void setFinYear(int finYear) {
		this.finYear = finYear;
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

	@Override
	public String toString() {
		return "OpeningBalance [id=" + id + ", finYear=" + finYear + ", caId=" + caId + ", project=" + project
				+ ", debit=" + debit + ", credit=" + credit + ", currency=" + currency + ", company=" + company
				+ ", createdBy=" + createdBy + "]";
	}

	

}
