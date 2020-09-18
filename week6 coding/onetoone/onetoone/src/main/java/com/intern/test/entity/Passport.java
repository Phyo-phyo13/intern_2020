package com.intern.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Passport")
@SequenceGenerator(name="seq",initialValue=1,allocationSize=100)
public class Passport {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq")
	Long personId;
	
	@Column(name="passportNumber")
	Integer passportNumber;

	@Column(name="validDate")
	String validDate;

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	public Integer getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(Integer passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getValidDate() {
		return validDate;
	}

	public void setValidDate(String validDate) {
		this.validDate = validDate;
	}
	
	

}
