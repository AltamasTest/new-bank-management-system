package com.account.service.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.account.service.domain.Account;
import com.account.service.dto.AccountDto;

public interface AccountService {
	public Account createAccount(Account account);
	public Account getAccountDetailsById(int id);
	public List<Account> getAllAccount();
	

}
