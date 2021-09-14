package com.example.agency.agency.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.agency.agency.model.Agency;
import com.example.agency.agency.model.Employees;
import com.example.agency.agency.repository.AgencyRepository;


@Service
public class AgencyService {

	@Autowired
	private AgencyRepository agencyRepository;


	public void createAgency(String iva, String name) {
		agencyRepository.save(new Agency(iva, name));
	}

	public void assumeEmployee(String iva, Employees employee) {
		Agency agency = agencyRepository.findById(iva).get();
		agency.getEmployees().add(employee);
		agencyRepository.save(agency);
	}

	public void fireEmployee(String iva, Employees employee) {
		Agency agency = agencyRepository.findById(iva).get();
		agency.getEmployees().remove(employee);
		agencyRepository.save(agency);
	}


	public List<Agency> getAll(){
		return agencyRepository.findAll();
	}
	
	public List<Employees> getAllEmployees(String iva){
		Agency agency = agencyRepository.findById(iva).get();
		return agency.getEmployees();
	}

	

}
