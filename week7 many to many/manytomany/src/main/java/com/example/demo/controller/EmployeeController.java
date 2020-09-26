package com.example.demo.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmpAssignPojo;
import com.example.demo.entity.Employee;
import com.example.demo.entity.Phone;
import com.example.demo.entity.Project;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.PhoneService;
import com.example.demo.service.ProjectService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	PhoneService phoneService;
	
	@Autowired
	ProjectService projectService;
	
	@PostMapping (value = "/employee")
    public Employee createEmployee(@RequestBody Employee employee){

        Collection<Phone> phones= employee.getPhones();
        if(phones !=null){
           phones = phoneService.saveAll(phones);
        }

        for(Phone phone : phones){
            employee.addPhone(phone);
        }

       return employeeService.save(employee);
    }
	
	 @GetMapping (value = "/employees")
	    public List<Employee> findAll(){
	        return employeeService.findAll();
	    }
	 
	 

		@PutMapping(value = "/assign/project")
		public Employee assignProject(@RequestBody EmpAssignPojo empAssignPojo) {
			Employee employee = employeeService.findById(empAssignPojo.getEmployeeId());
			List<Project> projects = projectService.findforAllId(empAssignPojo.getProjectList());
			employee.setProjects(projects);
			return employeeService.save(employee);

		}
	
	

}
