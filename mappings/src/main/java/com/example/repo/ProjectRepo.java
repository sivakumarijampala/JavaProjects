package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.mappings.Project;

public interface ProjectRepo extends JpaRepository<Project, Integer> {

	@Query("select p from Project p where p.student.id=:studentId")
	Project FindByStudentId(int studentId);
	
	
	

	

}
