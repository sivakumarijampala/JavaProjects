package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.interfaceprojection.AddressView;
import com.example.models.Address;

public interface AddressService {
	
	public  List<Object[]> findbyid(int id);
	
	//public Optional<AddressView> findbyid(int id);

}
