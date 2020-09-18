package com.intern.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.intern.test.entity.Person;
import com.intern.test.service.PersonService;

@RestController
public class PersonController {
	@Autowired
	PersonService personService;
	
	@GetMapping(value="/person")
	public List<Person> getPersons(@RequestBody Person person)
	{
		return personService.getPerson();
	}
	
	@PostMapping(value="/person")
	public Person addPerson(@RequestBody Person person) {
		return personService.addPersont(person);
	}

}
