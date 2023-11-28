package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.models.Project2;

public interface ProjectRepo extends JpaRepository<Project2, Integer> {

	//@Query("select p from Project2 p where p.student.id=:studentId")
	//Project2 FindByStudentId(int studentId);

}
