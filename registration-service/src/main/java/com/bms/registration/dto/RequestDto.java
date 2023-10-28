package com.bms.registration.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import jakarta.persistence.Column;

//@Bean
public class RequestDto {
	private int registrationId;
	private String name;
	private String username;
	private String password;
	private String address;
	private String country;
	private String state;
	private String emailAddress;
	private int contactNo;
	@JsonFormat(pattern = "dd/mm/yy", shape = Shape.STRING)
	@Column(name = "dateOfBirth")
	private String dateOfBirth;
	private String accountType;
	private int accountNo;
	private String branchName;
	private int initialDepositAmount;
	private String identificationProofType;
	private String identificationDocumentNo;
	
	
	public RequestDto() {
		
	}

	public RequestDto(int registrationId, String name, String username, String password, String address, String country, String state,
			String emailAddress, int contactNo, String dateOfBirth, String accountType, int accountNo,
			String branchName, int initialDepositAmount, String identificationProofType,
			String identificationDocumentNo) {
	
		this.registrationId = registrationId;
		this.name = name;
		this.username = username;
		this.password = password;
		this.address = address;
		this.country = country;
		this.state = state;
		this.emailAddress = emailAddress;
		this.contactNo = contactNo;
		this.dateOfBirth = dateOfBirth;
		this.accountType = accountType;
		this.accountNo = accountNo;
		this.branchName = branchName;
		this.initialDepositAmount = initialDepositAmount;
		this.identificationProofType = identificationProofType;
		this.identificationDocumentNo = identificationDocumentNo;
	}

	public int getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public int getContactNo() {
		return contactNo;
	}


	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getAccountType() {
		return accountType;
	}


	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


	public int getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}


	public String getBranchName() {
		return branchName;
	}


	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}


	public int getInitialDepositAmount() {
		return initialDepositAmount;
	}


	public void setInitialDepositAmount(int initialDepositAmount) {
		this.initialDepositAmount = initialDepositAmount;
	}


	public String getIdentificationProofType() {
		return identificationProofType;
	}


	public void setIdentificationProofType(String identificationProofType) {
		this.identificationProofType = identificationProofType;
	}


	public String getIdentificationDocumentNo() {
		return identificationDocumentNo;
	}


	public void setIdentificationDocumentNo(String identificationDocumentNo) {
		this.identificationDocumentNo = identificationDocumentNo;
	}
	
	
	
	

}
