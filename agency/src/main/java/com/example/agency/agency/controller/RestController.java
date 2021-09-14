package com.example.agency.agency.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.agency.agency.model.Agency;
import com.example.agency.agency.model.Employees;
import com.example.agency.agency.service.AgencyService;

@RequestMapping("/api")
@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	AgencyService agencyService;
	
	@GetMapping("/all")
	public List<Agency> getAllAgency(){
		return agencyService.getAll();
	}
	
	@GetMapping("/all/employees")
	public List<Employees> getAllAgency(@RequestParam(name="iva") String iva){
		return agencyService.getAllEmployees(iva);
	}
	
	@GetMapping("/create")
	public void create(@RequestParam(name="iva") String iva,
			@RequestParam(name="name") String name){
		agencyService.createAgency(iva, name);
	}
}