package it.softwareinside.lesson13.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.softwareinside.lesson13.model.Smartphone;

@Repository
public interface ArtistRepository extends CrudRepository<Smartphone, Integer>{

}
