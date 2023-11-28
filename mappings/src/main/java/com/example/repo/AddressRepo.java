package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mappings.Address;

public interface AddressRepo extends JpaRepository<Address, Integer> {

}
