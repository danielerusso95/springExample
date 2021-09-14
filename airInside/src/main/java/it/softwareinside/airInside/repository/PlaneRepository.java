package it.softwareinside.airInside.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.softwareinside.airInside.model.Plane;

@Repository
public interface PlaneRepository extends CrudRepository<Plane, String> {

}
