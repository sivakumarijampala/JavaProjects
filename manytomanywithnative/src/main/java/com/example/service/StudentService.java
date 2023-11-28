package com.example.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.models.Student2;

public interface StudentService {

	public  List<Student2> savestudent(List<Student2> students);

	public List<Student2> findAll();

	public Student2 updateStudent(int id, Student2 student);

	public Page<Student2> getPage(int pageNo, int pageSize);

	public void delete(int id);

}
