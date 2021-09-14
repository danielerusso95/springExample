package it.softwareinside.mysqltest.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="postalCode")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PostalCode {

	@JsonProperty(access = Access.WRITE_ONLY)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@JsonAlias("post code")
	private String code;
	
	@JsonAlias("country")
	private String country;
	

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="pcodeId")
	@JsonAlias("cities")
	private List<City> places;


	public PostalCode(String postalCode, String country) {
		this.code = postalCode;
		this.country = country;
		this.places = new ArrayList<City>();
	}
	
	
	
}
