package it.softwareInside.terzaAcademy24.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import it.softwareInside.terzaAcademy24.model.University;

@Repository
public interface UniversityRepository extends JpaRepository<University, String> {

	/**
	 * 
	 * 
	 * creare una query SQL,
	 * chiamata findbyCountry
	 * 
	 */
	
	
	// ?1   ?2
	
	//@Query("SELECT u FROM User u WHERE u.status = ?1 and u.name = ?2")
	//User findUserByStatusAndName(Integer status, String name);

	// @Query("FROM Author WHERE firstName = ?1")
    //List<Author> findByFirstName(String firstName, Sort sort);
	
	
	@Query(countQuery = "SELECT count(*) FROM University WHERE country= :country", 
			  nativeQuery = true)
	int countByCountry(@Param("country") String country);
	
	
	
	@Query("FROM University WHERE country =?1")
	List<University> findbyCountry(String country);
	
	
}
