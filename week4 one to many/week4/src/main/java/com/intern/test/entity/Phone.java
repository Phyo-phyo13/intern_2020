package com.intern.test.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;



@Entity
@Table(name="Phone")
@SequenceGenerator(name="seq",initialValue=1,allocationSize=100)
public class Phone {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String number;

    private String type;

    @Column(name = "EMP_ID")
    private Long employeeId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	
	@Override
	public String toString() {
		return "Phone [id=" +id+",number=" +number+",type=" +type+",employeeId="
				+ employeeId+"]";
	}
		
	}

	

    



