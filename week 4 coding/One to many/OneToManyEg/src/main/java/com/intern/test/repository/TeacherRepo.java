package com.intern.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.intern.test.entity.TeacherEntity;
@Repository
public interface TeacherRepo extends JpaRepository<TeacherEntity,Integer> {

}
