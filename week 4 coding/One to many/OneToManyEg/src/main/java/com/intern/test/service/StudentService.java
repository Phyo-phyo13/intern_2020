package com.intern.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intern.test.entity.StudentEntity;
import com.intern.test.repository.StudentRepo;

@Service
public class StudentService {
	@Autowired
	StudentRepo studentRepository;
	
	public List<StudentEntity> getDepartment(){
		return studentRepository.findAll();
	}
	public StudentEntity addDepartment(StudentEntity teacher) {
		return studentRepository.save(teacher);
		
	}
	public StudentEntity getDepartmentById(int id) {
		return studentRepository.findById(id).orElse(null);
		
	}
	public void deleteDepartment(int id) {
		studentRepository.deleteById(id);
	}
}
