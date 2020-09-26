package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Project;
import com.example.demo.repository.ProjectRepository;

@Service

public class ProjectService {
	@Autowired
	ProjectRepository projectRepository;

	public Project save(Project project){
        return projectRepository.save(project);
    }
    public List<Project> findforAllId(List<Long> idList){
        return projectRepository.findByIdIn(idList);
    }
    public List<Project> findAll(){
        return projectRepository.findAll();
    }
}
