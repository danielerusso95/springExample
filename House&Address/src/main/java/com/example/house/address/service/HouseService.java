package com.example.house.address.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.house.address.model.Address;
import com.example.house.address.model.House;
import com.example.house.address.repository.HouseRepository;



@Service
public class HouseService {
	@Autowired
	private HouseRepository houseRepository;

	public void fill() {
		House house = new House(100,"appartamento",new Address("ciao",4));
		houseRepository.save(house);
	}
	public List<House> getAll(){
		return houseRepository.findAll();
	}
}
