package it.softwareInside.TerzaAcademy18.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="dipendente")
public class Dipendente {

	
	@Id
	@Column(name="cf" , length = 16)
	private String cf;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="ruolo")
	private String ruolo;
	
	
}
