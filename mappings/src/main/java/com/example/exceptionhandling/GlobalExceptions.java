 package com.example.exceptionhandling;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.exceptions.ProjectDetailsNotFoundException;
import com.example.exceptions.ProjectIdNotFoundException;
import com.example.exceptions.SaveProjectException;
import com.example.exceptions.SaveStudentException;
import com.example.exceptions.StudentIdNotFoundException;
import com.example.exceptions.StudentNotFoundException;
import com.example.exceptions.StudentsNotFound;
import com.example.exceptions.UpdateProject;
import com.example.exceptions.UpdateStudent;

@ControllerAdvice
@ResponseStatus
public class GlobalExceptions extends ResponseEntityExceptionHandler{

	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<String> studentIdNotFoundException(StudentNotFoundException notfound) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("student id not found " + notfound.getMessage());

	}

	@ExceptionHandler(SaveStudentException.class)
	public ResponseEntity<String> handleSaveStudentException(SaveStudentException ex) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
	}

	@ExceptionHandler(StudentsNotFound.class)
	public ResponseEntity<String> handleGetStudentsException(StudentsNotFound ex) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());

	}

	@ExceptionHandler(UpdateStudent.class)
	public ResponseEntity<String> handleUpdateStudentException(UpdateStudent ex) {
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
	}

	@ExceptionHandler(SaveProjectException.class)
	public ResponseEntity<String> handleSaveProjectException(SaveProjectException ex) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
	}

	@ExceptionHandler(UpdateProject.class)
	public ResponseEntity<String> handleUpdateProjectException(UpdateProject ex) {
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());

	}
	
	
	@ExceptionHandler(StudentIdNotFoundException.class)
	public ResponseEntity<String> handleStudentIdNotFound(StudentIdNotFoundException ex){
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
	}

	
	@ExceptionHandler(ProjectIdNotFoundException.class)
	public ResponseEntity<String> handleProjectIdNotFoundException(ProjectIdNotFoundException ex){
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
		
	}
	
	@ExceptionHandler(ProjectDetailsNotFoundException.class)
	public ResponseEntity<String> handleProjectDetailsNotFoundException(ProjectDetailsNotFoundException ex){
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
	}
	
}
