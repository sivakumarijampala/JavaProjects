package com.example.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.models.Student1;

public interface StudentService {

	public Student1 savestudent(Student1 student);

	public List<Student1> findAll();

	public Student1 updateStudent(int id, Student1 student);

	public Page<Student1> getPage(int pageNo, int pageSize);

	public void delete(int id);

}
