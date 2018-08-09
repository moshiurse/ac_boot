/**
 * 
 */
package com.project.accounting.servicesImpl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.project.accounting.model.ViewVoucher;
import com.project.accounting.repository.ReportRepository;
import com.project.accounting.services.ReportService;

/**
 * @author Legend Of Legends
 *
 */
@Service
public class ReportServiceImpl implements ReportService{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private ReportRepository repository;
	


@SuppressWarnings("unchecked")
@Override
public List<Map<String, Object>> getTrialBalance(
		int company, int finYear, String startDate,String endDate) {
	String query = "select ca_id, ca_name, sum(debit), sum(credit)\r\n" + 
			"from view_voucher\r\n" + 
			"where company_id = ? and fin_year = ? and v_date between CAST(? AS DATE) and  CAST(? AS DATE)\r\n" + 
			"group by ca_id\r\n" + 
			"order by ca_id";
	
	return jdbcTemplate.queryForList(query, company, finYear,startDate,endDate);
}



@Override
public List<Map<String, Object>> getLedger(int company, int finYear, String finStartDate, String startDate,
		String endDate) {
	
	String query = "";
	return jdbcTemplate.queryForList(query, company, finYear,finStartDate,startDate,endDate);
}

}
