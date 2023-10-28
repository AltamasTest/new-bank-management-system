package com.bms.registration.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationResponseDto {

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
}
