package com.project.accounting.services;

import com.project.accounting.model.VoucherDetail;
import com.project.accounting.model.VoucherMaster;

public interface VoucherService {
	
	VoucherMaster saveVoucherMaster(VoucherMaster master);
	
	VoucherDetail saveVoucherDetail(VoucherDetail detail);

}
