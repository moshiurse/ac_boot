package com.project.accounting.servicesImpl;

import com.project.accounting.model.BankAccount;
import com.project.accounting.model.BankInfo;
import com.project.accounting.repository.BankAccountRepository;
import com.project.accounting.repository.BankInfoRepository;
import com.project.accounting.services.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Moshiur on 11/15/2018.
 */
@Service
public class BankServicesImpl implements BankService {

@Autowired
BankAccountRepository bankAccountRepository;

@Autowired
BankInfoRepository bankInfoRepository;


@Override
public BankInfo saveBankInfo(BankInfo bankInfo) {
	return bankInfoRepository.save(bankInfo);
}

@Override
public BankAccount saveBankAccount(BankAccount bankAccount) {
	return bankAccountRepository.save(bankAccount);
}

@Override
public List<BankInfo> showAllBank() {
	return bankInfoRepository.findAll();
}

@Override
public List<BankAccount> showAllBankAccount() {
	return bankAccountRepository.findAll();
}

@Override
public List<BankInfo> showActiveBank() {
	return bankInfoRepository.showActiveBank();
}

@Override
public List<BankAccount> showActiveBankAccountByCompany(int company) {
	return bankAccountRepository.showActiveBankAccount(company);
}

@Override
public void disableBank(int id) {
	bankInfoRepository.disableBank(id);
}

@Override
public void disableBankAccount(Long id, int company) {
	bankAccountRepository.disableBankAccount(id, company);
}

@Override
public List<BankAccount> searchbankAccount(String value, int company) {
	return bankAccountRepository.findBankAccountByIdOrNo(value, company);
}

@Override
public List<BankInfo> searchbank(String value) {
	return bankInfoRepository.findBankByIdOrNameOrShortName(value);
}
}
