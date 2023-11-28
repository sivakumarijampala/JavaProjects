package com.example.sericeimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.feignclient.AddressClient;
import com.example.models.Address;
import com.example.models.Employee;
import com.example.repository.EmployeeRepository;
import com.example.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository repo;

	// @Autowired
	// private RestTemplate resttemplate;

	@Autowired
	private AddressClient addressclient;

//	EmployeeServiceImpl(RestTemplateBuilder builder){
//		this.resttemplate=builder.build();
//	}

	// @Override
	// public Employee findbyid(int id) {
//		ResponseEntity<Address> ad=new Address();
	// Employee employee = repo.findById(id).get();

	// resttemplate
	// ad=resttemplate.getForObject("http://localhost:8089/address/address/{id}",Address.class,id);

	// ResponseEntity<List<Object[]>> address = addressclient.findbyid(id);
	// List<Object[]> add = address.getBody();
	// employee.setAddress(address);
	// return employee;
	// }

	@Override
	public Employee findbyid(int id) {
		Employee employee = repo.findById(id).orElse(null);

		if (employee != null) {
			ResponseEntity<List<Object[]>> addressResponse = addressclient.findbyid(id);
			List<Object[]> addressData = addressResponse.getBody();

			if (addressData != null && !addressData.isEmpty()) {

				Address address = extractAddressFromData(addressData);

				employee.setAddress(address);
			}
		}

		return employee;
	}

	private Address extractAddressFromData(List<Object[]> addressData) {
		Address address = new Address();

		if (!addressData.isEmpty()) {
			Object[] data = addressData.get(0);
			if (data.length >= 4) {
				int id = (int) data[0];
				String lan1 = String.valueOf(data[1]);
				String lan2 = String.valueOf(data[2]);
				String state = String.valueOf(data[3]);

				address.setId(id);
				address.setLan1(lan1);
				address.setLan2(lan2);
				address.setState(state);

			}
		}

		return address;
	}

}
