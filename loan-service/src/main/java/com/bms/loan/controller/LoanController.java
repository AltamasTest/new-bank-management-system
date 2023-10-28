package com.bms.loan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bms.loan.domain.EducationLoan;
import com.bms.loan.domain.PersonalLoan;
import com.bms.loan.service.EducationLoanServiceImpl;
import com.bms.loan.service.PersonalLoanServiceImpl;

@RestController
@RequestMapping("/bms")
public class LoanController {

    @Autowired
	private  PersonalLoanServiceImpl personalLoanServiceImpl;
	public LoanController(PersonalLoanServiceImpl personalLoanServiceImpl) {
		super();
		this.personalLoanServiceImpl = personalLoanServiceImpl;
	}

	@Autowired
	private EducationLoanServiceImpl educationLoanServiceImpl;
	
	
	@PostMapping("/PersionalLoan")
	public ResponseEntity<PersonalLoan> applyPersonalLoan(@RequestBody PersonalLoan personalLoan) {
			return new ResponseEntity(personalLoanServiceImpl.savePersonalLoan(personalLoan), HttpStatus.CREATED);
		//return new ResponseEntity<PersonalLoan>(" You are successfully registered ",HttpStatus.CREATED);
	
	}
	
	
	@PostMapping("/EducationLoan")
	public ResponseEntity<EducationLoan> saveEducationLoan(@RequestBody EducationLoan educationLoan) {
			return new ResponseEntity(educationLoanServiceImpl.saveEducationLoan(educationLoan), HttpStatus.CREATED);
		//return new ResponseEntity<PersonalLoan>(" You are successfully registered ",HttpStatus.CREATED);
	
	}
	
	
	
	
	
	
	@GetMapping("/welcome")
	public String getWelcome() {
		return "Welcome to Loan";
		
	}
}
