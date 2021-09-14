package com.example.agency.agency.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.agency.agency.model.Agency;

@Repository
public interface AgencyRepository extends JpaRepository<Agency, String>{

}
