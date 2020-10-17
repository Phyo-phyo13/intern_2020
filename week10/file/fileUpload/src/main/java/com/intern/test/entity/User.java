package com.intern.test.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name="USER")
@SequenceGenerator(name="seq",initialValue=1,allocationSize=100)
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq")
	private Long id;
	
	@Column
	private String userName;
	
	@Column
	private String userEmail;
	
	@Column
	private String address;
	
	@Column
	private Date createdDate;
	
	@Column
	private String nrcPath;
	
	@Column
	private String profilePath;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getNrcPath() {
		return nrcPath;
	}

	public void setNrcPath(String nrcPath) {
		this.nrcPath = nrcPath;
	}

	public String getProfilePath() {
		return profilePath;
	}

	public void setProfilePath(String profilePath) {
		this.profilePath = profilePath;
	}
	
	
	
}
