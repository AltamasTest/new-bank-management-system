package com.bms.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bms.registration.domain.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Integer> {

}
