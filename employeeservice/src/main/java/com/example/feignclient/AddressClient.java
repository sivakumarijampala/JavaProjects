package com.example.feignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.models.Address;

@FeignClient(name="address-service",url = "http://localhost:8089/address/")
public interface AddressClient {
	
	@GetMapping("/address/{id}")
	public ResponseEntity<List<Object[]>> findbyid(@PathVariable("id") int id);
		
	

}
