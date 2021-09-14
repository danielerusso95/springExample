package it.softwareinside.mysqltest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="city")
@JsonIgnoreProperties(ignoreUnknown = true)
public class City {

	@Id
	@Column(length = 700)
	@JsonAlias("place name")
	private String place_name;
	
	@Column
	@JsonAlias("state")
	private String state;
	
	@Column
	@JsonAlias("longitude")
	private String longitude;
	
	@Column
	@JsonAlias("latitude")
	private String latitude;
	
	
}
