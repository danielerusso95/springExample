package it.softwareInside.TerzaAcademy18.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.softwareInside.TerzaAcademy18.model.Plane;


@Repository
public interface AziendaRepository extends CrudRepository<Plane, String> {

	
	
}
