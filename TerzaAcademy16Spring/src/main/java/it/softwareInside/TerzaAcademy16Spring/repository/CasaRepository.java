package it.softwareInside.TerzaAcademy16Spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.softwareInside.TerzaAcademy16Spring.model.Casa;

@Repository
public interface CasaRepository extends JpaRepository<Casa, Integer> {

}
