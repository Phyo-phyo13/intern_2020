package com.intern.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.intern.test.entity.Person;
import com.intern.test.repository.PersonRepo;

@Service
public class PersonService {
	@Autowired
	PersonRepo personRepo;
	public List<Person> getPerson(){
		return personRepo.findAll();
	}

	public Person addPersont(Person person) {
		return personRepo.save(person);
	}
	
	public Person  getPersonById(Long id) {
		return personRepo.findById(id).orElse(null);
	}
	

}
