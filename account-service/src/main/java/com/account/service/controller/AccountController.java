package com.account.service.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.account.service.domain.Account;
import com.account.service.dto.AccountDto;
import com.account.service.service.AccountServiceImpl;


@RestController
public class AccountController {
	
 private AccountServiceImpl accountServiceImpl;

public AccountController(AccountServiceImpl accountServiceImpl) {
	super();
	this.accountServiceImpl = accountServiceImpl;
}
 

@PostMapping("/createAccount")
public ResponseEntity<String> createAccount(@RequestBody Account account) {
	accountServiceImpl.createAccount(account);
	return new ResponseEntity<String>("Your Account has been Created successfully",HttpStatus.CREATED);
}


  @GetMapping("/{id}")
  public ResponseEntity<Account> getAccountDetailsById(@PathVariable ("id") int id) {
	 
	 // accountServiceImpl.getAccountDetails(id);
	  
	  return new ResponseEntity<Account>(accountServiceImpl.getAccountDetailsById(id), HttpStatus.OK);
	  	  
  }
  
  
  @GetMapping("/getAllAccount")
  public List <Account> getAllAccount(){
	  return accountServiceImpl.getAllAccount();
  }
  
  
  
  
	

}
