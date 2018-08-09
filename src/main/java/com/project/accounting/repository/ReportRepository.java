package com.project.accounting.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project.accounting.model.ViewVoucher;

public interface ReportRepository extends JpaRepository<ViewVoucher, String> {

	
	//Ledger
//	List<ViewVoucher> findByCompanyAndFinYearAndFinStartDateAndFinEndDate(
//			int company, int finYear, Date finStartDate, Date voucherDate);
	
	
	public List<ViewVoucher> findByCompanyAndFinYearAndVoucherDateBetween(
			int company, int finYear, String startDate, String endDate);
//	{
//		
//		//TrialBalance
//		@Query(value="select ca_id, ca_name, sum(debit), sum(credit)\r\n" + 
//				"from view_voucher\r\n" + 
//				"where company_id = :company and fin_year = :finYear and v_date between CAST(" + startDate + " AS DATE) and  CAST(endDate AS DATE)\r\n" + 
//				"group by ca_id\r\n" + 
//				"order by ca_id");
//		
//		/*List<ViewVoucher>findByCompanyAndFinYearAndStartDateAndEndDate(
//				@Param("company")int company, @Param("finYear")int finYear); */
//
//		return null;
//	}
}
