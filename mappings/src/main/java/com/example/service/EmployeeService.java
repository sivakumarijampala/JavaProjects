package com.example.service;

import java.util.List;

import com.example.mappings.Employee;

public interface EmployeeService {
	
	public Employee saveEmployee(Employee emp);
	public List<Employee> findAll();
    public void deleteEmp(int id);
    public Employee updateEmployee(Employee emp,int id);
    
}
