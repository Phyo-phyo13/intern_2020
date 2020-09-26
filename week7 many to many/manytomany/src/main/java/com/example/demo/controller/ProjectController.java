package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Project;
import com.example.demo.service.ProjectService;

@RestController
public class ProjectController {
	
	@Autowired
	ProjectService projectService;
	
    @PostMapping (value = "/project")
    public Project  createProject(@RequestBody  Project project){
       return  projectService.save(project);
    }
    @GetMapping (value = "/projects")
    public List<Project> findAll(){
        return projectService.findAll();
    }
    @PutMapping (value = "/project")
    public Project updateProject(@RequestBody Project project){
        return projectService.save(project);
    }

}
