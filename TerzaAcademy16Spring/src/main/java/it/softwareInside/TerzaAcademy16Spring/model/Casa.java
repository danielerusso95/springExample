package it.softwareInside.TerzaAcademy16Spring.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@Entity
@Table(name="casa")
public class Casa {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	
	@Column(name="metriQuadri")
	private double metriQuadri;
	
	@Column(name="tipologia")
	private String tipologia;
	
	
	@OneToOne(targetEntity=Indirizzo.class,cascade=CascadeType.ALL)  
	private Indirizzo indirizzo;


	public Casa(double metriQuadri, String tipologia, Indirizzo indirizzo) {
		super();
		this.metriQuadri = metriQuadri;
		this.tipologia = tipologia;
		this.indirizzo = indirizzo;
	}
	
	
	
	
	
}
