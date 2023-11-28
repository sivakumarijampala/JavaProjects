package com.example.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Address;
import com.example.repository.AddressRepository;
import com.example.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

	
	@Autowired
	AddressRepository repository;
	
	@Override
	public Address findbyid(int id) {
		// TODO Auto-generated method stub
		Address address=repository.findAddressByEmpid(id);
		return address;
	}

}
