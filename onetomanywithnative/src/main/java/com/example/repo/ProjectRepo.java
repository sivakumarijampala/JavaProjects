package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.models.Project1;

public interface ProjectRepo extends JpaRepository<Project1, Integer> {

	@Query("select p from Project1 p where p.student.id=:studentId")
	Project1 FindByStudentId(int studentId);

}
