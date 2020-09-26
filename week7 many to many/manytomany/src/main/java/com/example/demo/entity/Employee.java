package com.example.demo.entity;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String name;
	private String surname;
	private String title;
	private Date created;
	@OneToMany 
    @JoinColumn(name = "EMP_ID" )
	private Collection<Phone> phones;
	@ManyToMany
    @JoinTable(
            name = "emp_proj",
            joinColumns = @JoinColumn(name = "emp_id"),
            inverseJoinColumns = @JoinColumn(name = "proj_id"))
     private   List<Project> projects;
    
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Collection<Phone> getPhones() {
		return phones;
	}
	public void setPhones(Collection<Phone> phones) {
		this.phones = phones;
	}
	
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	public void addPhone(Phone phone) {
        if (phones==null) {
            phones = new ArrayList<Phone>();
        }
        if (!phones.contains(phone)) {
            phones.add(phone);
        }
    }
	@Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", surname=" + surname
                + ", title=" + title + ", phones=" + phones + "]";
    }
	
	
	


	

}
