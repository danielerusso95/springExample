package com.example.house.address.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.house.address.model.House;
import com.example.house.address.service.HouseService;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	private HouseService houseService;
		
	@GetMapping("/api/fill")
	public void fill() {
		houseService.fill();
	}
	
	@GetMapping("/api/all")
	public List<House> getAll() {
		return houseService.getAll();
	}
}