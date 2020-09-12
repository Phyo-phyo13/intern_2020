package com.intern.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.intern.test.entity.TeacherEntity;
import com.intern.test.repository.TeacherRepo;

@Service
public class TeacherService {
	@Autowired
	TeacherRepo teacherRepository;
	
	public List<TeacherEntity> getDepartment(){
		return teacherRepository.findAll();
	}
	public TeacherEntity addDepartment(TeacherEntity teacher) {
		return teacherRepository.save(teacher);
		
	}
	public TeacherEntity getDepartmentById(int id) {
		return teacherRepository.findById(id).orElse(null);
		
	}
	public void deleteDepartment(int id) {
		teacherRepository.deleteById(id);
	}
	

}
