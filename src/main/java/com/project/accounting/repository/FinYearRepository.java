package com.project.accounting.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.accounting.model.Company;
import com.project.accounting.model.FinYear;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface FinYearRepository extends JpaRepository<FinYear, Long> {
//	Find Fin year By Company
	List<FinYear> findByCompany(int company);

//	Show All Active Fin Year of a company
	@Query("select f from FinYear f where f.company = :company and f.enabled = 1")
	List<FinYear> showActiveFinYearByCompany(@Param("company") int company);

//	Show All Active Fin Year
	@Query("select f from FinYear f where f.enabled = 1")
	List<FinYear> showActiveFinYear();

//	Disable a company when admin delete a fin year
	@Transactional
	@Modifying
	@Query("update FinYear f set f.enabled = 0 where f.finYearId = :id  and company = :company")
	void disableFinYear(@Param("id") Long id, @Param("company") int company);

}
