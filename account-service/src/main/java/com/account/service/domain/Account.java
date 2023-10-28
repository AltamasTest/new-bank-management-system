package com.account.service.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="account_tbl")
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int accountNo;
	private String accountHolderName;
	private String fathersName;
	private String mothersName;	
	private int phoneNo;
	private int aadharNo;
	private String accountType;
	private String address;
	
		
	public Account() {
		
	}
	
	
	public Account(int accountNo, String accountHolderName, String fathersName, String mothersName, int phoneNo,
			int aadharNo, String accountType, String address) {
		
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.fathersName = fathersName;
		this.mothersName = mothersName;
		this.phoneNo = phoneNo;
		this.aadharNo = aadharNo;
		this.accountType = accountType;
		this.address = address;
	}


	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getFathersName() {
		return fathersName;
	}
	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}
	public String getMothersName() {
		return mothersName;
	}
	public void setMothersName(String mothersName) {
		this.mothersName = mothersName;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public int getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(int aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}	
	
	

}
