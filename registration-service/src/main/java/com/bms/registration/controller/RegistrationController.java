package com.bms.registration.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.bms.registration.domain.Registration;
import com.bms.registration.dto.RequestDto;
import com.bms.registration.service.RegistrationServiceImpl;

@RestController
@RequestMapping("/bms")
public class RegistrationController {

	private RegistrationServiceImpl registrationService;

	public RegistrationController(RegistrationServiceImpl registrationService) {
		super();
		this.registrationService = registrationService;
	}

	@GetMapping("/welcome")
	 public String getWelcome() {
		 return "Welcome";
	 }
	/*
	 * @PostMapping("/saveRegistration") public ResponseEntity<Registration>
	 * doRegistration(@RequestBody Registration registration) { //
	 * registrationService.doRegistration(registration); return new
	 * ResponseEntity<Registration>(registrationService.doRegistration(registration)
	 * , HttpStatus.CREATED); }
	 */
	
	@PostMapping("/saveRegistration")
	public ResponseEntity<String> doRegistration(@RequestBody Registration registration) {
		 registrationService.doRegistration(registration);
		return new ResponseEntity<String>(" You are successfully registered ", HttpStatus.CREATED);
	}
	
	
	// getAll getAllRegistired
	@GetMapping("/getAllRegistired")
	public List<Registration> getAllRegistired(){
		return registrationService.getAllRegistired();
		
	}
	
	@GetMapping("/getRegistration/{id}")
	public  ResponseEntity<Registration> getRegistrationById(@PathVariable("id") int id) {
		return new ResponseEntity<Registration>(registrationService.getRegistrationById(id), HttpStatus.OK);
		
		
	}
	
	
	@PostMapping("/addCustomer")
	public String addCustomer(@RequestBody RequestDto requestDto) {
	   String name=registrationService.addCustomer(requestDto);
				
		return name;
	}
	
	
	
	
	
	//  update Registration details
	
	/*
	 * @PutMapping("/updateRegistration/{id}") public ResponseEntity<Registration>
	 * updateRegistration(@PathVariable (registrationId) int registrationId){
	 * 
	 * return new ResponseEntity<Registration>(registrationService., null) }
	 */
}
