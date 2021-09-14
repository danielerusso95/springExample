package it.softwareInside.TerzaAcademy18.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="azienda")
public class Plane {

	@Id
	@Column(name="iva" , length = 16)
	private String iva;


	@Column(name="ragione_sociale")
	private String ragioneSociale;

	@Column(name="tipologia")
	private String tipologia;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="pIvaId")  
	private List<Dipendente> dipendenti ;

	public Plane(String iva, String ragioneSociale, String tipologia) {

		this.iva = iva;
		this.ragioneSociale = ragioneSociale;
		this.tipologia = tipologia;
		this.dipendenti = new ArrayList<>();
	}





}
