package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
public class Project {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private long id;
	@Column(name="PROJECT_NAME")
	String projectName;
	@Column(name="PROJECT_DESCRIPTION")
	String projectDescription;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectDescription() {
		return projectDescription;
	}
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	
	

}
