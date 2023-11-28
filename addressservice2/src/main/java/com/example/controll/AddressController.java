package com.example.controll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Address;
import com.example.service.AddressService;

@RestController
public class AddressController {
	
	@Autowired
	AddressService service;
	
	@GetMapping("/address/{id}")
	public ResponseEntity<Address> findbyid(@PathVariable("id") int id){
		Address address=service.findbyid(id);
		return ResponseEntity.ok(address);
	}

}
