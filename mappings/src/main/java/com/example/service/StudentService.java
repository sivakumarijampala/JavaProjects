package com.example.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.mappings.Student;

public interface StudentService {
	
   public Student savestudent(Student student);
   public List<Student> findAll();
   public Student updateStudent(int id,Student student);
   public Page<Student> getPage(int pageNo, int pageSize) ;
   public  void  delete(int id);

}
