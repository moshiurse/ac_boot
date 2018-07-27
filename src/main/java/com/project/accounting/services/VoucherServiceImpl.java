package com.project.accounting.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.accounting.model.VoucherDetail;
import com.project.accounting.model.VoucherMaster;
import com.project.accounting.repository.VoucherDetailRepository;
import com.project.accounting.repository.VoucherMasterRepository;

@Service
public class VoucherServiceImpl implements VoucherService {
	
	@Autowired
	private VoucherMasterRepository masterRepo;
	
	@Autowired
	private VoucherDetailRepository detailRepo;
	

	@Override
	public VoucherMaster saveVoucherMaster(VoucherMaster master) {
		return masterRepo.save(master);
	}

	@Override
	public VoucherDetail saveVoucherDetail(VoucherDetail detail) {
		return detailRepo.save(detail);
	}
	
	

}
