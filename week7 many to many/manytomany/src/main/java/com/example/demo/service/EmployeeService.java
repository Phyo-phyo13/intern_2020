package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;

import com.example.demo.repository.EmployeeRepository;


@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;
	
	public Employee save(Employee employee){
	    return employeeRepository.save(employee);
	 }


	 public List<Employee> findAll(){
	     return employeeRepository.findAll();
	 }


	public Employee findById(Long employeeId) {
		
		return employeeRepository.findById(employeeId).orElse(null);
	}
	
	

}
