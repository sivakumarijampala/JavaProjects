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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mappings.Address;
import com.example.service.AddressService;

@RestController
public class AddressController {

	@Autowired
	AddressService addressService;

	@GetMapping(value = "/find")
	public ResponseEntity<List<Address>> findAddress() {
		return ResponseEntity.ok(addressService.findAddress());

	}
	
	@PostMapping(value="/saveadd/{id}")
	public ResponseEntity<Address> saveAddress(@RequestBody Address add,@PathVariable  int id){
		return ResponseEntity.ok(addressService.saveAddressByEmpId(add, id));
	}
	
	@DeleteMapping(value="/deleteadd/{id}")
	public ResponseEntity<String> deleteAddress(@PathVariable int id){
		addressService.deleteAddress(id);
		return ResponseEntity.ok("address deleted successfully with"+id);
	}

	@PutMapping(value="/updateadd/{id}")
	public ResponseEntity<Address> updateAddress(@RequestBody Address add,@PathVariable int id){
		return ResponseEntity.ok(addressService.updateAddress(add, id));
	}
	
}
