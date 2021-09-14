package it.softwareInside.TerzaAcademy16Spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@Entity
@Table(name="indirizzo")
public class Indirizzo {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;

	
	@Column(name="via")
	private String via;
	
	@Column(name="numero")
	private int numero;

	public Indirizzo(String via, int numero) {
		super();
		this.via = via;
		this.numero = numero;
	}
	
	
	
	
}
