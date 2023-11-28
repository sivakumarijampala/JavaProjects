package com.example.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Student1;
import com.example.serviceimpl.StudentServiceNativeImpl;

@RestController
public class StudentnativeController {
	@Autowired
	StudentServiceNativeImpl stuNativeImpl;

	@PostMapping(value = "/savestud")
	public Student1 saveStudent(@RequestBody Student1 student) {
		Student1 stud = stuNativeImpl.savestudent(student);
		return stud;

	}

	@GetMapping(value = "/getstud")
	public ResponseEntity<List<Student1>> getStud() {
		List<Student1> students = stuNativeImpl.findAll();
		return ResponseEntity.ok(students);
	}

	@DeleteMapping(value = "/deletestud/{id}")
	public ResponseEntity<String> deleteStud(@PathVariable int id) {
		stuNativeImpl.delete(id);
		return ResponseEntity.ok("student deleted successfully with  id: " + id);
	}

	@PutMapping(value = "/updatestud/{id}")
	public ResponseEntity<Student1> updateStud(@PathVariable int id, @RequestBody Student1 student) {
		Student1 stud = stuNativeImpl.updateStudent(id, student);
		return ResponseEntity.ok(stud);
	}
}
