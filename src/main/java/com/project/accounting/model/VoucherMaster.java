package com.project.accounting.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;

@Entity
@Table(name="voucher_master")
public class VoucherMaster{
	
	//private static final long serialVersionUID = 1L;

	@Id
	@Column(name ="voucherno")
	private String voucherNo;
	
	@Column(name ="date")
	private String voucherDate;
	
	@Column(name ="fin_year")
	private int finYear;
	
	@Column(name ="currency")
	private String currency;
	
	@Column(name ="narration")
	private String narration;
	
	@Column(name ="active")
	private String active;
	
	@Column(name ="description")
	private String description;
	
	@Column(name ="verified_by")
	private String verifiedBy;
	
	@Column(name ="verified_date")
	private String verifiedDate;
	
	@Column(name ="status")
	private String voucherStatus;
	
	@Column(name ="company_id")
	private int companyId ;
	
	@Column(name ="vm_created_by")
	private String createdBy;
	
	@OneToMany(mappedBy = "voucherNo", fetch = FetchType.EAGER)
	private List<VoucherDetail> voucherDetails;
	
	
	public String getVoucherNo() {
		return voucherNo;
	}

	public void setVoucherNo(String voucherNo) {
		this.voucherNo = voucherNo;
	}

	public String getVoucherDate() {
		return voucherDate;
	}

	public void setVoucherDate(String voucherDate) {
		this.voucherDate = voucherDate;
	}

	public int getFinYear() {
		return finYear;
	}

	public void setFinYear(int finYear) {
		this.finYear = finYear;
		
	}

	public String getCurrent() {
		return currency;
	}

	public void setCurrent(String current) {
		this.currency = current;
		
	}

	public String getNarration() {
		return narration;
	}

	public void setNarration(String narration) {
		this.narration = narration;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
		
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
		
	}

	public String getVerifiedBy() {
		return verifiedBy;
	}

	public void setVerifiedBy(String verifiedBy) {
		this.verifiedBy = verifiedBy;
	}

	public String getVerifiedDate() {
		return verifiedDate;
	}

	public void setVerifiedDate(String verifiedDate) {
		this.verifiedDate = verifiedDate;
	}

	public String getVoucherStatus() {
		return voucherStatus;
	}

	public void setVoucherStatus(String voucherStatus) {
		this.voucherStatus = voucherStatus;
		
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
	
	public List<VoucherDetail> getVoucherDetails() {
		return voucherDetails;
	}

	public void setVoucherDetails(List<VoucherDetail> voucherDetails) {
		this.voucherDetails = voucherDetails;
	}




	@Override
	public String toString() {
		return "VoucherMaster [voucherNo=" + voucherNo + ", voucherDate=" + voucherDate + ", finYear=" + finYear
				+ ", current=" + currency + ", narration=" + narration + ", active=" + active + ", description="
				+ description + ", verifiedBy=" + verifiedBy + ", verifiedDate=" + verifiedDate + ", voucherStatus="
				+ voucherStatus + ", companyId=" + companyId + ", createdBy=" + createdBy + "]";
	}
	
}
