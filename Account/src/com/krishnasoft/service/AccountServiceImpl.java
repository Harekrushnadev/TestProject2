package com.krishnasoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishnasoft.dao.AccountDao;
import com.krishnasoft.dto.Account;
@Service("accService")

public class AccountServiceImpl implements AccountService{
	@Autowired(required=true)
	private AccountDao dao;
	@Override
	public String createAccount(String accNo, String accName, String accType, int balance) {
	return dao.create(accNo, accName, accType, balance);
	}
	@Override
	public String searchAccount(String accNo) {
	return dao.search(accNo);
	}
	@Override
	public Account getAccount(String accNo) {
	return dao.getAccount(accNo);
	}
	@Override
	public String updateAccount(String accNo, String accName, String accType, int 
	balance) {
	return dao.update(accNo, accName, accType, balance);
	}
	@Override
	public String deleteAcount(String accNo) {
	return dao.delete(accNo);
	}
}
