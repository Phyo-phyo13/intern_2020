package com.intern.test.controller;

import java.util.Collection;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.intern.test.entity.Phone;
import com.intern.test.entity.Employee;
import com.intern.test.service.EmployeeService;
import com.intern.test.service.PhoneService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	PhoneService phoneService;
	@PostMapping (value = "/employee")
    public Employee createEmployee(@RequestBody Employee employee){

        Collection<Phone> phones=employee.getPhones();
        if(phones !=null){
           phones = phoneService.saveAll(phones);
        }

        for(Phone phone : phones){
            employee.addPhone(phone);
        }

       return employeeService.save(employee);}
   @GetMapping (value = "/employees")
    
   public List<Employee> findAll(){
        return employeeService.findAll();
    }

}
