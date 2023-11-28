package com.example.controller;

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

import com.example.mappings.Employee;
import com.example.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping(value="/saveemp")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		log.info("entered into employee controller save employee method");
		Employee employee2=employeeService.saveEmployee(employee);
		return ResponseEntity.ok(employee2);
	}
	
	@GetMapping(value="/findemp")
	public ResponseEntity<List<Employee>> findAll(){
		List<Employee> emp=employeeService.findAll();
		return ResponseEntity.ok(emp);
	}

	@DeleteMapping(value="/deleteemp/{id}")
	public ResponseEntity<String> delete(@PathVariable  int id){
		employeeService.deleteEmp(id);
		return ResponseEntity.ok("employee deleted successfully with "+id);
		
	}
	
	@PutMapping(value="/updateemp/{id}")
	public ResponseEntity<Employee> update(@RequestBody Employee emp,@PathVariable int id){
		Employee em=employeeService.updateEmployee(emp, id);
		return ResponseEntity.ok(em);
	}
	
}
