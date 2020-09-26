package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Project;



@Repository


public interface ProjectRepository extends JpaRepository<Project , Long> {
	List<Project> findByIdIn(List<Long> idList);

}
