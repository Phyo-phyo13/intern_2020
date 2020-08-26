package com.intern.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.intern.test.entity.TeacherEntity;

@Repository
public interface TeacherRepositoty extends JpaRepository<TeacherEntity,Long> {
	@Query(value="Select t from TeacherEntity t where t.teacherName like concat"
			+ "('%',concat(?1,'%'))"+"and t.teacherPosition like concat('%',concat(?2,'%'))"+
			"and t.teacherAddress like concat('%',concat(?3,'%'))")
List<TeacherEntity> searchEntity(String name,String phone,String address);
}
