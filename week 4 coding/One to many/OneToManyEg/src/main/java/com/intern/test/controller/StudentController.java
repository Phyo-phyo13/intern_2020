package com.intern.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.intern.test.entity.StudentEntity;
import com.intern.test.service.StudentService;



@RestController
public class StudentController {
	@Autowired
	StudentService studentService;
	
	

	@GetMapping(value="/student")
	public List<StudentEntity> getEmployee() {
		return  studentService.getDepartment();
	}
	@PostMapping(value="/student")
	public StudentEntity addEmployee(@RequestBody StudentEntity employee) {
		return  studentService.addDepartment(employee);
	}
	@GetMapping(value="/student/(id)")
	public StudentEntity getEmployeeById(@PathVariable int id){
		return  studentService.getDepartmentById(id);
	}
	@DeleteMapping(value="/student/(id)")
	public void deleteEmployeeById(@PathVariable int id){
		 studentService.getDepartmentById(id);
	}

}
