package com.example.service;

import java.util.List;

import com.example.mappings.Address;
import com.example.mappings.Employee;

public interface AddressService {
	
	public List<Address> findAddress();
	public Address saveAddressByEmpId(Address add,int id);
	public void deleteAddress(int id);
	public Address updateAddress(Address add,int id);
}
