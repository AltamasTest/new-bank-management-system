package com.bms.registration.service;

import java.util.List;
import java.util.Optional;

import com.bms.registration.domain.Registration;
import com.bms.registration.dto.RequestDto;

public interface RegistrationService {	

	Registration doRegistration(Registration registration);
	
	 List<Registration>  getAllRegistired ();
	
	Registration upDateRegistration(int registrationId);
	
	Registration getRegistrationById(int id);
	
	String addCustomer(RequestDto requestDto);
	
	
	
}
