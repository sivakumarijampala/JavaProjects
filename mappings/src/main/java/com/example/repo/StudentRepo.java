package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mappings.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
