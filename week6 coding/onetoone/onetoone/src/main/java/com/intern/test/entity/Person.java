package com.intern.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name="Person")
@SequenceGenerator(name="seq",initialValue=1,allocationSize=100)
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq")
	Long personId;
	
	@Column(name="Name")
	String personName;

	@Column(name="dateOfBirth")
	String dateOfBath;

	public Long getPersonId() {
		return personId;
	}


	@OneToOne
	@JoinColumn(name="personId")
	private Passport passport;
	
	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getDateOfBath() {
		return dateOfBath;
	}

	public void setDateOfBath(String dateOfBath) {
		this.dateOfBath = dateOfBath;
	}
	
	
	
	


}
