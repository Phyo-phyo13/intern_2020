package com.intern.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.intern.test.entity.Passport;
import com.intern.test.service.PassportService;

@RestController
public class PassportController {
@Autowired
PassportService passportService;

@GetMapping(value="/passport")
public List<Passport> getPassport(@RequestBody Passport passport)
{
	return passportService.getPassport();
}

@PostMapping(value="/passport")
public Passport addPassport(@RequestBody Passport passport) {
	return passportService.addPassport(passport);
}

}
