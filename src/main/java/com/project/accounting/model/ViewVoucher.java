package com.project.accounting.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Immutable;

@Entity
//@Immutable
@Table(name="view_voucher")
public class ViewVoucher implements Serializable{

	private static final long serialVersionUID = 1L;


	@Id
	@Column(name="voucherno")
	private String voucherNo;
	
	@Column(name="v_date")
	private String voucherDate;
	
	@Column(name="sl_no")
	private Date serialNo;
	
	@Column(name="project_id")
	private Date projectId;
	
	@Column(name="project_name")
	private Date projectName;
	
	@Column(name="narration")
	private String narration;
	
	@Column(name="mr_no")
	private String mrNo;
	
	@Column(name="inv_no")
	private String invoiceNo;
	
	@Column(name="chq_no")
	private String chequeNo;
	
	@Column(name="bill_no")
	private String billNo;
	
	@Column(name="booking_id")
	private String bookingId;
	
	@Column(name="fin_year")
	private int finYear;
	
	@Column(name="dept_id")
	private String department;
	
//	@Id
	@Column(name="ca_id")
	private String caId;

	@Column(name="ca_name")
	private String caName;

	@Column(name="ca_code")
	private String caCode;

	@Column(name="debit")
	private double debit;

	@Column(name="credit")
	private double credit;
	
	@Column(name="currency")
	private String currency;
	
	@Column(name="company_id")
	private int company;
	
	@Column(name="company_name")
	private String companyName;

	@Column(name="finyear_no")
	private int finYearNo;
	
	@Column(name="fin_start_date")
	private Date finStartDate;
	
	@Column(name="fin_end_date")
	private Date finEndDate;
	
	
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


	public Date getSerialNo() {
		return serialNo;
	}


	public void setSerialNo(Date serialNo) {
		this.serialNo = serialNo;
	}


	public Date getProjectId() {
		return projectId;
	}


	public void setProjectId(Date projectId) {
		this.projectId = projectId;
	}


	public Date getProjectName() {
		return projectName;
	}


	public void setProjectName(Date projectName) {
		this.projectName = projectName;
	}


	public String getNarration() {
		return narration;
	}


	public void setNarration(String narration) {
		this.narration = narration;
	}


	public String getMrNo() {
		return mrNo;
	}


	public void setMrNo(String mrNo) {
		this.mrNo = mrNo;
	}


	public String getInvoiceNo() {
		return invoiceNo;
	}


	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}


	public String getChequeNo() {
		return chequeNo;
	}


	public void setChequeNo(String chequeNo) {
		this.chequeNo = chequeNo;
	}


	public String getBillNo() {
		return billNo;
	}


	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}


	public String getBookingId() {
		return bookingId;
	}


	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}


	public int getFinYear() {
		return finYear;
	}


	public void setFinYear(int finYear) {
		this.finYear = finYear;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getCaId() {
		return caId;
	}


	public void setCaId(String caId) {
		this.caId = caId;
	}


	public String getCaName() {
		return caName;
	}


	public void setCaName(String caName) {
		this.caName = caName;
	}


	public String getCaCode() {
		return caCode;
	}


	public void setCaCode(String caCode) {
		this.caCode = caCode;
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


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public int getFinYearNo() {
		return finYearNo;
	}


	public void setFinYearNo(int finYearNo) {
		this.finYearNo = finYearNo;
	}


	public Date getFinStartDate() {
		return finStartDate;
	}


	public void setFinStartDate(Date finStartDate) {
		this.finStartDate = finStartDate;
	}


	public Date getFinEndDate() {
		return finEndDate;
	}


	public void setFinEndDate(Date finEndDate) {
		this.finEndDate = finEndDate;
	}


	@Override
	public String toString() {
		return "ViewVoucher [voucherNo=" + voucherNo + ", voucherDate=" + voucherDate + ", serialNo=" + serialNo
				+ ", projectId=" + projectId + ", projectName=" + projectName + ", narration=" + narration + ", mrNo="
				+ mrNo + ", invoiceNo=" + invoiceNo + ", chequeNo=" + chequeNo + ", billNo=" + billNo + ", bookingId="
				+ bookingId + ", finYear=" + finYear + ", department=" + department + ", caId=" + caId + ", caName="
				+ caName + ", caCode=" + caCode + ", debit=" + debit + ", credit=" + credit + ", currency=" + currency
				+ ", company=" + company + ", companyName=" + companyName + ", finYearNo=" + finYearNo
				+ ", finStartDate=" + finStartDate + ", finEndDate=" + finEndDate + "]";
	}


	
	
}