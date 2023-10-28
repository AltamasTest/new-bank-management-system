package com.bms.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.bms.loan.domain.PersonalLoan;

@Repository
@EnableJpaRepositories
public interface PersonalLoanRepository extends JpaRepository<PersonalLoan, Integer> {
	
}
