package com.project.accounting.services;

import java.util.List;

import com.project.accounting.model.VoucherDetail;
import com.project.accounting.model.VoucherMaster;

public interface VoucherService {
	
	VoucherMaster saveVoucherMaster(VoucherMaster voucherMaster);
	
	VoucherDetail saveVoucherDetail(VoucherDetail voucherDetail);
	
	List<VoucherMaster> getAllVoucherMaster();

}
