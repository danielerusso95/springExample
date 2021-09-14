package it.softwareInside.terzaAcademy24.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name="university")
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class University {
	
	
	@Id
	@Column(name="nome")
	@JsonAlias("name")
	private String mioNome;

	
	@Column(name="country")
	private String country;
	
	
	
	@JsonAlias("state-province")
	private String provincia;
	
	
	@JsonAlias("web_pages")
	private String[] webSites;

	
}
