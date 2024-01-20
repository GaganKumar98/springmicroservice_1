package com.bank.account.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.account.dto.CustomerDto;
import com.bank.account.repository.AccountsRepository;
import com.bank.account.repository.CustomerRepository;

@Service
public class AccountsServiceImpl implements IAccountsService {

	@Autowired
	private AccountsRepository accountsRepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public void createAccounts(CustomerDto customerDto) {
		
		
	}

}
