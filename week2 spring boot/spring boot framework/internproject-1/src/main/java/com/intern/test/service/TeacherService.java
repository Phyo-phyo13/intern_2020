package com.intern.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intern.test.entity.TeacherEntity;
import com.intern.test.repository.TeacherRepositoty;

@Service
public class TeacherService {
	@Autowired
 TeacherRepositoty teacherRepository;
	
	public List<TeacherEntity> getTeacher(){
		return teacherRepository.findAll();
	}
	
	public TeacherEntity addTeacher(TeacherEntity teacher) {
		return teacherRepository.save(teacher);
	}
	
	public TeacherEntity  getTeacherById(Long id) {
		return teacherRepository.findById(id).orElse(null);
	}
	public void deleteTeacherById(Long id) {
		teacherRepository.deleteById(id);
	}
}
