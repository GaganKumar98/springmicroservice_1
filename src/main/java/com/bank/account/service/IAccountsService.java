package com.bank.account.service;

import com.bank.account.dto.CustomerDto;
import com.bank.account.entity.Customer;

public interface IAccountsService {

	void createAccounts(CustomerDto customerDto);
}
