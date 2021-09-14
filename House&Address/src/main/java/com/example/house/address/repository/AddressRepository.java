package com.example.house.address.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.house.address.model.Address;


@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
