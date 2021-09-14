package it.softwareinside.lesson13exercise.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.softwareinside.lesson13exercise.model.Artist;

@Repository
public interface ArtistRepository extends CrudRepository<Artist, Integer>{

}
