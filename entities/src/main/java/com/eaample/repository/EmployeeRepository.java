package com.eaample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.models.Employee;



public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
