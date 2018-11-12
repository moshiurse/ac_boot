package com.project.accounting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.accounting.model.VoucherDetail;
import com.project.accounting.model.VoucherMaster;
import com.project.accounting.servicesImpl.VoucherServiceImpl;

@Controller
@RequestMapping("/voucher")
public class VoucherController {
	
	@Autowired
	VoucherServiceImpl voucherService;
	
	@RequestMapping(value= "/save",method= RequestMethod.POST)
	public String saveVoucher(@RequestBody VoucherMaster voucherMaster) {
		voucherMaster.setCompanyId(1);
		voucherMaster.setFinYear(1);
		voucherMaster.setCurrent("TK");
		voucherMaster.setActive("Y");
		voucherMaster.setCreatedBy("moshiur");
		
		voucherService.saveVoucherMaster(voucherMaster);
		System.out.println("Controller"+voucherMaster.toString());
		
		for(VoucherDetail detail: voucherMaster.getVoucherDetails()) {
			
			detail.setBankId(1);
			if(detail.getCredit()== 0){
				detail.setCredit(0); 
			}else if (detail.getDebit()== 0) {
				detail.setDebit(0);
			}	
			voucherService.saveVoucherDetail(detail);
			System.out.println("Controller"+detail.toString());
			
		}
		
		return "Voucher Inserted Successfully!";
	}

}
