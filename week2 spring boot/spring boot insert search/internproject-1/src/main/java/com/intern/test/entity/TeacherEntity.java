package com.intern.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Teacher")
@SequenceGenerator(name="seq",initialValue=1,allocationSize=100)
public class TeacherEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq")
	Long teacherId;
	
	@Column(name="TEACHER_NAME")
	String teacherName;
	
	@Column(name="TEACHER_POSITION")
	String teacherPosition;
	
	@Column(name="TEACHER_ADDRESS")
	String teacherAddress;


	public Long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherPosition() {
		return teacherPosition;
	}

	public void setTeacherPosition(String teacherPosition) {
		this.teacherPosition = teacherPosition;
	}

	public String getTeacherAddress() {
		return teacherAddress;
	}

	public void setTeacherAddress(String teacherAddress) {
		this.teacherAddress = teacherAddress;
	}
}
