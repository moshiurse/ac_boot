package com.project.accounting.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="acc_bank_cheque")
public class BankChecque {
	
	@Id
	@Column(name ="cheque_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int chequeId;
	
	@Column(name ="account_id")
	private int accountId;
	
	@Column(name ="cheque_no")
	private String chequeNo;
	
	@Column(name ="cheque_date")
	private String chequeDate =null;
	
	@Column(name ="expence_date")
	private String expenceDate =null;
	
	@Column(name ="expence_mode")
	private String expenceMode =null;
	
	@Column(name ="cheque_amount")
	private Double chequeAmount =0.0;
	
	@Column(name ="created_by")
	private String createdBy =null;

	public int getChequeId() {
		return chequeId;
	}

	public void setChequeId(int chequeId) {
		this.chequeId = chequeId;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getChequeNo() {
		return chequeNo;
	}

	public void setChequeNo(String chequeNo) {
		this.chequeNo = chequeNo;
	}

	public String getChequeDate() {
		return chequeDate;
	}

	public void setChequeDate(String chequeDate) {
		this.chequeDate = chequeDate;
	}

	public String getExpenceDate() {
		return expenceDate;
	}

	public void setExpenceDate(String expenceDate) {
		this.expenceDate = expenceDate;
	}

	public String getExpenceMode() {
		return expenceMode;
	}

	public void setExpenceMode(String expenceMode) {
		this.expenceMode = expenceMode;
	}

	public Double getChequeAmount() {
		return chequeAmount;
	}

	public void setChequeAmount(Double chequeAmount) {
		this.chequeAmount = chequeAmount;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	public String toString() {
		return "BankChecque [chequeId=" + chequeId + ", accountId=" + accountId + ", chequeNo=" + chequeNo
				+ ", chequeDate=" + chequeDate + ", expenceDate=" + expenceDate + ", expenceMode=" + expenceMode
				+ ", chequeAmount=" + chequeAmount + ", createdBy=" + createdBy + "]";
	}
	
	
	
	
	
}
	
