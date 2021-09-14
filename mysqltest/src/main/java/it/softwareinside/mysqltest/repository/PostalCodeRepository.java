package it.softwareinside.mysqltest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import it.softwareinside.mysqltest.model.PostalCode;

@Repository
public interface PostalCodeRepository extends JpaRepository<PostalCode,Long > {

	@Query(countQuery = "SELECT count * FROM PostalCode WHERE code= :postalCode", 
			  nativeQuery = true)
	int countByCode(@Param("postalCode") String postalCode);
	
	@Query("FROM PostalCode WHERE code=?1")
	List<PostalCode> findbyCode(String postal_code);
	
}
