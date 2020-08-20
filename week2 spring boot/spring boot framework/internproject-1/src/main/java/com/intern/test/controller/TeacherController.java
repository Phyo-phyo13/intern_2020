package com.intern.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.intern.test.entity.TeacherEntity;
import com.intern.test.service.TeacherService;

@RestController
public class TeacherController {
	
@Autowired
TeacherService teacherService;


	@GetMapping(value="/teachers")
	
	public List<TeacherEntity> getTeacher(){
		return teacherService.getTeacher();
	}
	@PostMapping(value="/teachers")
		public TeacherEntity addTeacher(@RequestBody TeacherEntity teacher) {
		return teacherService.addTeacher(teacher);
	}
	
	@GetMapping(value="/teachers/{id}")
		public TeacherEntity getTeacherById(@PathVariable Long id) {
		return teacherService.getTeacherById(id);
	}
	@DeleteMapping(value="/teachers/{id}")
		public void deleteTeacherById(@PathVariable Long id) {
		teacherService.deleteTeacherById(id);
	}
}
