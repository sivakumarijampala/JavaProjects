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

import com.example.models.Student2;
import com.example.serviceimpl.StudentServiceNativeImpl;

@RestController
public class StudentnativeController {
	@Autowired
	StudentServiceNativeImpl stuNativeImpl;

	@PostMapping(value = "/savestudent")
	public List<Student2> saveStudent(@RequestBody List<Student2> student) {
		List<Student2> stud = stuNativeImpl.savestudent(student);
		return stud;

	}

	@GetMapping(value = "/getstud")
	public ResponseEntity<List<Student2>> getStud() {
		List<Student2> students = stuNativeImpl.findAll();
		return ResponseEntity.ok(students);
	}

	@DeleteMapping(value = "/deletestud/{id}")
	public ResponseEntity<String> deleteStud(@PathVariable int id) {
		stuNativeImpl.delete(id);
		return ResponseEntity.ok("student deleted successfully with  id: " + id);
	}

	@PutMapping(value = "/updatestud/{id}")
	public ResponseEntity<Student2> updateStud(@PathVariable int id, @RequestBody Student2 student) {
		Student2 stud = stuNativeImpl.updateStudent(id, student);
		return ResponseEntity.ok(stud);
	}
}
