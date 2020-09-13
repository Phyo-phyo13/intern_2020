package com.intern.test.service;

import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.intern.test.entity.Phone;
import com.intern.test.repository.PhoneRepo;


@Service
public class PhoneService {
	@Autowired
	PhoneRepo phoneRepository;
	
public Phone save(Phone phone) {
	return phoneRepository.save(phone);
	
}
	
public Collection<Phone> saveAll(Collection<Phone> phones){
	return phoneRepository.saveAll(phones);
}

}
