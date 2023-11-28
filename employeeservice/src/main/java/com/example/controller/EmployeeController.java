package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Employee;
import com.example.sericeimpl.EmployeeServiceImpl;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImpl service;
	
	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee> findbyid(@PathVariable("id") int id){
		Employee employee=service.findbyid(id);
		return ResponseEntity.ok(employee);
	}

}
