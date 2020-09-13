package com.intern.test.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intern.test.entity.Employee;

import com.intern.test.repository.EmployeeRepo;




@Service
public class EmployeeService {
	@Autowired
	EmployeeRepo employeeRepository;
	
	public Employee save(Employee employee) {
		return employeeRepository.save(employee);
		
	}
		
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}
	

}
