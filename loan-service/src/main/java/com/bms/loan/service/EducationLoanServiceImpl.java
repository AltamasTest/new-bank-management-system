package com.bms.loan.service;

import org.springframework.stereotype.Service;

import com.bms.loan.domain.EducationLoan;
import com.bms.loan.domain.PersonalLoan;
import com.bms.loan.repository.EducationLoanRepository;


@Service
public class EducationLoanServiceImpl implements EducationLoanInterface {

	private EducationLoanRepository educationLoanRepository;	
	
	public EducationLoanServiceImpl(EducationLoanRepository educationLoanRepository) {
		super();
		this.educationLoanRepository = educationLoanRepository;
	}

	@Override
	public EducationLoan saveEducationLoan(EducationLoan educationLoan) {
		
		return educationLoanRepository.save(educationLoan) ;
	}






	
	

}
