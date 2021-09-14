package com.example.agency.agency.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.agency.agency.model.Employees;

public interface EmployeesRepository extends JpaRepository<Employees, String>{

}
