package com.bms.registration.service;

import org.springframework.security.core.userdetails.UserDetailsService;


import com.bms.registration.dto.UserRegistrationDto;
import com.bms.registration.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);

}
