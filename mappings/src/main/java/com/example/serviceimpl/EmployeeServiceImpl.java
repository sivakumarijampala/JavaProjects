package com.example.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mappings.Employee;
import com.example.repo.EmployeeRepo;
import com.example.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepo employeeRepo;

	@Override
	public Employee saveEmployee(Employee emp) {
		employeeRepo.saveEmployee(emp.getName(), emp.getSalary());
		int empId = employeeRepo.getLastInsertedEmployeeId();
		// int empId=emp.getId();

		if (emp.getAddress() != null) {
			employeeRepo.saveAddress(emp.getAddress().getMobile(), emp.getAddress().getState(), empId);
		}
		return emp;
	}

	@Override
	public List<Employee> findAll() {
		List<Employee> employees = employeeRepo.findAll();
		return employees;
	}

	@Override
	public void deleteEmp(int id) {
		employeeRepo.deleteAddress(id);
		employeeRepo.deleteEmployee(id);

	}

	@Override
	public Employee updateEmployee(Employee emp,int id) {
		Employee employee=employeeRepo.findEmpById(id);
		employeeRepo.updateEmployee(emp.getName(),emp.getSalary(),employee.getId());
		employeeRepo.updateAddress(emp.getAddress().getMobile(),emp.getAddress().getState(),employee.getId());
		return emp;
	}

}
