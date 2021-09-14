package it.softwareInside.com.Vacanze1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.softwareInside.com.Vacanze1.model.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team,String>{

}
