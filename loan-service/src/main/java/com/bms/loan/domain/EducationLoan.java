package com.bms.loan.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="education_Loan_tbl")
public class EducationLoan {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int loanId;
private String name;
private String loanType;
private String Date;
private int loanAmount;
private String loanDuration;
private int rateOfInterest;
private int courseFee;
private String course;
private String fatherName;
private String fatherOccupation;
private int annualIncome;



public EducationLoan() {
	
}

public EducationLoan(int loanId, String name, String loanType, String date, int loanAmount, String loanDuration,
		int rateOfInterest, int courseFee, String course, String fatherName, String fatherOccupation,
		int annualIncome) {
	
	this.loanId = loanId;
	this.name = name;
	this.loanType = loanType;
	Date = date;
	this.loanAmount = loanAmount;
	this.loanDuration = loanDuration;
	this.rateOfInterest = rateOfInterest;
	this.courseFee = courseFee;
	this.course = course;
	this.fatherName = fatherName;
	this.fatherOccupation = fatherOccupation;
	this.annualIncome = annualIncome;
}

public int getLoanId() {
	return loanId;
}

public void setLoanId(int loanId) {
	this.loanId = loanId;
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

public int getCourseFee() {
	return courseFee;
}

public void setCourseFee(int courseFee) {
	this.courseFee = courseFee;
}

public String getCourse() {
	return course;
}

public void setCourse(String course) {
	this.course = course;
}

public String getFatherName() {
	return fatherName;
}

public void setFatherName(String fatherName) {
	this.fatherName = fatherName;
}

public String getFatherOccupation() {
	return fatherOccupation;
}

public void setFatherOccupation(String fatherOccupation) {
	this.fatherOccupation = fatherOccupation;
}

public int getAnnualIncome() {
	return annualIncome;
}

public void setAnnualIncome(int annualIncome) {
	this.annualIncome = annualIncome;
}



}
