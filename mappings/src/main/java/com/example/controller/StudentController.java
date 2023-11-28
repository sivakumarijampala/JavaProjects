package com.example.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.exceptions.SaveStudentException;
import com.example.exceptions.StudentIdNotFoundException;
import com.example.exceptions.StudentsNotFound;
import com.example.exceptions.UpdateStudent;
import com.example.mappings.Student;
import com.example.service.StudentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class StudentController {

	Logger logger = LoggerFactory.getLogger(StudentController.class);

	@Autowired
	private StudentService studentService;

	@ResponseBody
	@PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
		logger.info("entered into savestudent method in student controller");
		if (student == null) {
			logger.error("student is null it is throwing save student exception");
			throw new SaveStudentException("student can not be null");
		}
		logger.info("student saved:{}", student);
		return ResponseEntity.ok(studentService.savestudent(student));
	}

	@GetMapping(value = "/fetch")
	public ResponseEntity<List<Student>> getAllStudents() {
		logger.info("entered getall student method in student controller");
		List<Student> students = studentService.findAll();
		if (students == null) {
			logger.error("students are null in database throwing student not found exception");
			throw new StudentsNotFound("students not present in database");
		}
		logger.info("student retrived successfully");
		return ResponseEntity.ok(students);

	}

	@PutMapping(value = "/update/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable int id, @RequestBody Student student) {

		logger.info("entered update student method in student controll");

		if (student == null) {
			logger.error("student is null throwing update student exception");
			throw new UpdateStudent("student not be null");
		}
		logger.info("student updated successfully");
		return ResponseEntity.ok(studentService.updateStudent(id, student));

	}

	@DeleteMapping(value = "/delete/{studid}")
	public ResponseEntity<String> deleteStudent(@PathVariable int studid) {
       logger.info("entered into student controller delete method");
		if (studid <= 0) {
			logger.error("student id is null throwing student id not found exception");
			throw new StudentIdNotFoundException("student id not found");
		}
		studentService.delete(studid);
		return ResponseEntity.ok("student  with " + studid + " deleted  successfully");
	}

	
	@GetMapping(value = "/fetch/{pageNum}/{pageSize}")
	public ResponseEntity<Page<Student>> getAll(@PathVariable int pageNum, @PathVariable int pageSize) {

		Page<Student> page = studentService.getPage(pageNum, pageSize);

		return ResponseEntity.ok(page);

	}

}
