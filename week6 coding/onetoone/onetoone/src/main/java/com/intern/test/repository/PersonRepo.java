package com.intern.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intern.test.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Long>  {

}
