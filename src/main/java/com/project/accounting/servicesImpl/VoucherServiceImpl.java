package com.project.accounting.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.accounting.model.VoucherDetail;
import com.project.accounting.model.VoucherMaster;
import com.project.accounting.repository.VoucherDetailRepository;
import com.project.accounting.repository.VoucherMasterRepository;
import com.project.accounting.services.VoucherService;

@Service
public class VoucherServiceImpl implements VoucherService{
	
	@Autowired
	private VoucherMasterRepository masterRepository;
	
	@Autowired
	private VoucherDetailRepository detailRepository;

	@Override
	public VoucherMaster saveVoucherMaster(VoucherMaster voucherMaster) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VoucherDetail saveVoucherDetail(VoucherDetail voucherDetail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VoucherMaster> getAllVoucherMaster() {
		// TODO Auto-generated method stub
		return null;
	}
	

		

}
