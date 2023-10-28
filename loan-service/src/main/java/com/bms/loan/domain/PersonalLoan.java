package com.bms.loan.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "persional_loan_tbl")
public class PersonalLoan {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int personalLoanId;
	private String name;
	private String loanType;
	private String Date;
	private int loanAmount;
	private String loanDuration;
	private int rateOfInterest;
	private int annualIncome;
	private String designation;
	private int totalExperience;
	private int experienceWithCurrentCompany;

	public PersonalLoan() {

	}

	public PersonalLoan(int personalLoanId, String name, String loanType, String date, int loanAmount,
			String loanDuration, int rateOfInterest, int annualIncome, String designation, int totalExperience,
			int experienceWithCurrentCompany) {
		super();
		this.personalLoanId = personalLoanId;
		this.name = name;
		this.loanType = loanType;
		Date = date;
		this.loanAmount = loanAmount;
		this.loanDuration = loanDuration;
		this.rateOfInterest = rateOfInterest;
		this.annualIncome = annualIncome;
		this.designation = designation;
		this.totalExperience = totalExperience;
		this.experienceWithCurrentCompany = experienceWithCurrentCompany;
	}

	public int getPersonalLoanId() {
		return personalLoanId;
	}

	public void setPersonalLoanId(int personalLoanId) {
		this.personalLoanId = personalLoanId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public int getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getLoanDuration() {
		return loanDuration;
	}

	public void setLoanDuration(String loanDuration) {
		this.loanDuration = loanDuration;
	}

	public int getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(int rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public int getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(int annualIncome) {
		this.annualIncome = annualIncome;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getTotalExperience() {
		return totalExperience;
	}

	public void setTotalExperience(int totalExperience) {
		this.totalExperience = totalExperience;
	}

	public int getExperienceWithCurrentCompany() {
		return experienceWithCurrentCompany;
	}

	public void setExperienceWithCurrentCompany(int experienceWithCurrentCompany) {
		this.experienceWithCurrentCompany = experienceWithCurrentCompany;
	}

}
