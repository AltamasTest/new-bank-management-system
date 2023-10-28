package com.account.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.account.service.domain.Account;


public interface AccountRepository extends JpaRepository<Account, Integer>{

}
