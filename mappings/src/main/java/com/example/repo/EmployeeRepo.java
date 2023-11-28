package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.mappings.Address;
import com.example.mappings.Employee;
import com.example.mappings.Project;
import com.example.mappings.Student;

import jakarta.transaction.Transactional;

@Transactional
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {


	@Modifying
	@Transactional
	@Query(value = "insert into Employee (emp_name,emp_sal) values (:name,:salary)", nativeQuery = true)
	void saveEmployee(@Param("name") String name, @Param("salary") int salary);
	
	@Modifying
	@Transactional
	@Query(value="insert into Address (mobile,state,employee_id) values (:mobile,:state,:employeeId)",nativeQuery = true)
	void saveAddress(@Param("mobile") int mobile,@Param("state") String state,@Param("employeeId") int employeeId);
	
	
	@Query(value = "SELECT LAST_INSERT_ID()", nativeQuery = true)
	int getLastInsertedEmployeeId();
	
	
	//select
	@Query(value="select * from Employee",nativeQuery = true)
	List<Employee> findAll();
	
	
	//delete
	@Modifying
	@Transactional
	@Query(value="delete from Employee e where e.emp_id=:id",nativeQuery = true)
	public void deleteEmployee(@Param("id")  int id);
	
	
	@Modifying
	@Transactional
	@Query(value="delete from Address a where a.employee_id=:id",nativeQuery = true)
	public void deleteAddress(@Param("id")  int id);

	
	
	@Query(value="select * from Employee where emp_id=:id",nativeQuery = true)
	public Employee findEmpById(@Param("id") int id);
	
	@Query(value="select * from Address where employee_id=:id",nativeQuery = true)
	public Address findAddById(@Param("id") int id);
	
	@Modifying
	@Transactional
	@Query(value="update Employee e set e.emp_name=:name,e.emp_sal=:salary where e.emp_id=:empId",nativeQuery = true)
	public void updateEmployee(@Param("name") String name,@Param("salary") int salary,@Param("empId") int empId);
	
	@Modifying
	@Transactional
	@Query(value="update Address a set a.mobile=:mobile,a.state=:state where a.employee_id=:empId",nativeQuery = true)
	public void updateAddress(@Param("mobile") int mobile,@Param("state") String state,@Param("empId") int empId);
	
}
