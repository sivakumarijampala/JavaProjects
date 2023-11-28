package com.example.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.interfaceprojection.AddressView;
import com.example.models.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {
	
	//@Query(value="select  ea.lan1,ea.lan2,e.name from address ea join employee e on e.id=ea.emp_id where ea.emp_id=:id",nativeQuery = true)
	//Optional<AddressView> findAddressByEmpid(@Param("id")  int id);

	@Query( nativeQuery = true,value="select ea.addressid,ea.lan1,ea.lan2,ea.state from address ea join employee e on e.id=ea.emp_id where ea.emp_id=:id")
	List<Object[]> findAddressByEmpid(@Param("id")  int id);

}
