package com.bms.registration.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.bms.registration.domain.Registration;
import com.bms.registration.dto.RequestDto;
import com.bms.registration.excepction.ResourceNotFoundExcepction;
import com.bms.registration.repository.RegistrationRepository;

@Service
public class RegistrationServiceImpl implements RegistrationService {

	private RegistrationRepository registrationRepository;
	
	//@Autowired
	private RequestDto requestDto;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	 public RegistrationServiceImpl(RegistrationRepository registrationRepository) {
		super();
		this.registrationRepository = registrationRepository;
	}


	// save registration
	@Override
	public Registration doRegistration(Registration registration) {
				
		return  registrationRepository.save(registration);
	}
	
	//   Get all Registired customers
	@Override
	public List<Registration> getAllRegistired() {
		
		List allRegistered= registrationRepository.findAll();
		
		return allRegistered;
	}

	
	
	

    // update Registration Details
	@Override
	public Registration upDateRegistration(int registrationId) {
		Registration reg=new Registration();		
		
		return null;
	}


	@Override
	public Registration getRegistrationById(int id) {
		
	//	Registration registration=registrationRepository
		
		
		 return registrationRepository.findById(id).orElseThrow(()->new ResourceNotFoundExcepction("Registration", "id", registrationRepository));
	}


	
	  @Override 
	  public String addCustomer(RequestDto requestDto) { 
		  Registration registration= new Registration( requestDto.getRegistrationId(),
				  requestDto.getName(), 
				  requestDto.getEmailAddress(),
			this.passwordEncoder.encode(requestDto.getPassword()),
				   null, null, null, null, 0, null, null, 0, null, 0, null, null); 
		  	registrationRepository.save(registration);
	  return registration.getName()+" Successfully registered"; 
	  }
	 



     
	
}
