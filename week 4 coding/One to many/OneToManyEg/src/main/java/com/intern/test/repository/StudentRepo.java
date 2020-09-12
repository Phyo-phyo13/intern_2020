package com.intern.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intern.test.entity.StudentEntity;



@Repository
public interface StudentRepo extends JpaRepository<StudentEntity,Integer> {

}
