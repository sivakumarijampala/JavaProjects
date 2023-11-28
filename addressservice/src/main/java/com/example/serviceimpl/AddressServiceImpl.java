package com.example.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.interfaceprojection.AddressView;
import com.example.models.Address;
import com.example.repository.AddressRepository;
import com.example.service.AddressService;


@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	AddressRepository repository;

	@Override
	public List<Object[]> findbyid(int id) {
		// TODO Auto-generated method stub
		List<Object[]> address = repository.findAddressByEmpid(id);
		return address;
	}
	
	
	/*
	 * @Override public Optional<AddressView> findbyid(int id) { // TODO
	 * Auto-generated method stub Optional<AddressView> address =
	 * repository.findAddressByEmpid(id); return address; }
	 */

}
