package com.project.accounting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.accounting.model.VoucherDetail;

public interface VoucherDetailRepository extends JpaRepository<VoucherDetail, Integer>{
	

}
