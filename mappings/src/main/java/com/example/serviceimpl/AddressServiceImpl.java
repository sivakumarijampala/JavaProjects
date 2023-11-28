package com.example.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mappings.Address;
import com.example.repo.AddressRepo;
import com.example.repo.EmployeeRepo;
import com.example.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	AddressRepo addressRepo;

	@Autowired
	EmployeeRepo employeeRepo;

	@Override
	public List<com.example.mappings.Address> findAddress() {

		return addressRepo.findAll();
	}

	@Override
	public Address saveAddressByEmpId(Address add, int id) {
		employeeRepo.saveAddress(add.getMobile(), add.getState(), id);
		return add;
	}

	@Override
	public void deleteAddress(int id) {
		employeeRepo.deleteAddress(id);

	}

	@Override
	public Address updateAddress(Address add, int id) {
		employeeRepo.updateAddress(add.getMobile(), add.getState(), id);
		return add;
	}

}
