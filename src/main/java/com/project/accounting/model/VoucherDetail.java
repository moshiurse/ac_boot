package com.project.accounting.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Null;

@Entity
@Table(name="acc_voucher_detail")
public class VoucherDetail implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id")
	private Integer detailId;
	
	@Column(name ="vd_sl_no")
	private Byte serialNo;
	
	@ManyToOne
	@JoinColumn(name ="vd_vno")
	private VoucherMaster voucherMaster;
	
	@Column(name ="vd_ca_id")
	private String chartOfAccId;
	
	@Column(name ="vd_project_code")
	private String projectCode;
	
	@Column(name ="vd_deptId")
	private String departmentId;
	
	@Column(name ="vd_debit")
	private double debit;
	
	@Column(name ="vd_credit")
	private double credit;
	
	@Column(name ="vd_chq_no")
	private String chequeNo;
	
	@Column(name ="booking_id")
	private int bookingId;
	
	@Column(name ="vd_bill_no")
	private String billNo;
	
	@Column(name ="vd_inv_no")
	private String invoiceNo;
	
	@Column(name ="vd_mr_no")
	private String mrNo;
	
	@Column(name ="vd_desc")
	private String description;
	
	@Column(name ="vd_bank_id")
	private int bankId;
	
	@Column(name ="bandle_number")
	private String bandleNo;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public Byte getSerialNo() {
		return serialNo;
	}


	public void setSerialNo(Byte serialNo) {
		this.serialNo = serialNo;
	}


	

	public Integer getDetailId() {
		return detailId;
	}


	public void setDetailId(Integer detailId) {
		this.detailId = detailId;
	}


	public VoucherMaster getVoucherMaster() {
		return voucherMaster;
	}


	public void setVoucherMaster(VoucherMaster voucherMaster) {
		this.voucherMaster = voucherMaster;
	}


	public String getChartOfAccId() {
		return chartOfAccId;
	}

	public void setChartOfAccId(String chartOfAccId) {
		this.chartOfAccId = chartOfAccId;
	}

	public String getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
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

	public String getChequeNo() {
		return chequeNo;
	}

	public void setChequeNo(String chequeNo) {
		this.chequeNo = chequeNo;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getMrNo() {
		return mrNo;
	}

	public void setMrNo(String mrNo) {
		this.mrNo = mrNo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public String getBandleNo() {
		return bandleNo;
	}

	public void setBandleNo(String bandleNo) {
		this.bandleNo = bandleNo;
	}


	@Override
	public String toString() {
		return "VoucherDetail [detailId=" + detailId + ", serialNo=" + serialNo + ", voucherMaster=" + voucherMaster
				+ ", chartOfAccId=" + chartOfAccId + ", projectCode=" + projectCode + ", departmentId=" + departmentId
				+ ", debit=" + debit + ", credit=" + credit + ", chequeNo=" + chequeNo + ", bookingId=" + bookingId
				+ ", billNo=" + billNo + ", invoiceNo=" + invoiceNo + ", mrNo=" + mrNo + ", description=" + description
				+ ", bankId=" + bankId + ", bandleNo=" + bandleNo + "]";
	}

	

}
