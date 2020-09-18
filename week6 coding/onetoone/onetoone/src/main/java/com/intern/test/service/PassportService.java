package com.intern.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intern.test.entity.Passport;
import com.intern.test.repository.PassportRepo;

@Service
public class PassportService {
	@Autowired
	PassportRepo passportRepo;
	
	public List<Passport> getPassport(){
		return passportRepo.findAll();
	}

	public Passport addPassport(Passport passport) {
		return passportRepo.save(passport);
	}
	
	public Passport  getPassportById(Long id) {
		return passportRepo.findById(id).orElse(null);
	}
	public void deletePassportById(Long id) {
		passportRepo.deleteById(id);
	}
	
	
}
