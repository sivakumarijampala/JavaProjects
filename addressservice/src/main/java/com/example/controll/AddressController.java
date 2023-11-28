package com.example.controll;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.interfaceprojection.AddressView;
import com.example.service.AddressService;

@RestController
public class AddressController {
	
	Logger logger=LoggerFactory.getLogger(AddressController.class);

	@Autowired
	AddressService service;

	@GetMapping("/address/{id}")
	public ResponseEntity<List<Object[]>> findbyid(@PathVariable("id") int id){
		logger.trace("tracing started in address controller");
		logger.info("entered address controller id method");
		List<Object[]> address=service.findbyid(id);
		return ResponseEntity.ok(address);
	}

	/*
	 * @GetMapping("/address/{id}") public ResponseEntity<Optional<AddressView>>
	 * findbyid(@PathVariable("id") int id) { Optional<AddressView> address =
	 * service.findbyid(id);
	 * 
	 * if (!address.isPresent()) { throw new ResourceNotFound("resource with " + id
	 * + "not found"); }
	 * 
	 * return ResponseEntity.ok(address); }
	 */

}
