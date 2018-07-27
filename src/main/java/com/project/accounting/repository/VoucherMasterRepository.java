package com.project.accounting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.accounting.model.VoucherMaster;

public interface VoucherMasterRepository extends JpaRepository<VoucherMaster, Integer>{
	

}
