package com.project.accounting.services;

import com.project.accounting.model.BankAccount;
import com.project.accounting.model.BankInfo;

import java.util.List;

/**
 * Created by Moshiur on 11/15/2018.
 */
public interface BankService {

	BankInfo saveBankInfo(BankInfo bankInfo);

	BankAccount saveBankAccount(BankAccount bankAccount);

	List<BankInfo> showAllBank();

	List<BankAccount> showAllBankAccount();

	List<BankInfo> showActiveBank();

	List<BankAccount> showActiveBankAccountByCompany(int company);

	void disableBank(int id);

	void disableBankAccount(Long id,int company);

	List<BankAccount> searchbankAccount(String value, int company);

	List<BankInfo> searchbank(String value);
}
