package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.model.Address;

public interface AddressRepository extends JpaRepository<Address,Integer>{
	
	@Query( nativeQuery = true,value="select ea.id,ea.lan1,ea.lan2,ea.state from address ea join employee e on e.empid=ea.empid where ea.empid=:empId")
	Address findAddressByEmpid(@Param("empId") int empId);

}
