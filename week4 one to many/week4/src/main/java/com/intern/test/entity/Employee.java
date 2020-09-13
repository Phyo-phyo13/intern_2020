package com.intern.test.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name="Employee")
@SequenceGenerator(name="seq",initialValue=1,allocationSize=100)
public class Employee {
	 @Id
	    @GeneratedValue(strategy= GenerationType.AUTO)
	    private Long id;
	    private String name;
	    private String surname;
	    private String title;
	    private Date created;

	    @OneToMany //(cascade = CascadeType.ALL)
	    @JoinColumn(name = "EMP_ID" )
	    private Collection<Phone> phones;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
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

//		public void setPhones(Collection<Phone> phones) {
//			this.phones = phones;
//		}

		public void addPhone(Phone phone) {
			if(phones==null) {
				phones=new ArrayList<Phone>();
			}
			if(!phones.contains(phone)) {
				phones.add(phone);
			}
		}

}
