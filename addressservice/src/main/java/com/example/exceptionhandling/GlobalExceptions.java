package com.example.exceptionhandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.controll.ResourceNotFound;

@ControllerAdvice
public class GlobalExceptions {
	
	
   @ExceptionHandler(ResourceNotFound.class)
	public ResponseEntity<String> AddressNotfound(ResourceNotFound rs) {

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(" resource not found"+rs.getMessage());

	}

}
