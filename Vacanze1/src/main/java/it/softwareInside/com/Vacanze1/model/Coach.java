package it.softwareInside.com.Vacanze1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Coach")

@Data
@NoArgsConstructor
public class Coach {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="nome")
	private String nome;
	
	
	public Coach(String nome) {
		this.nome=nome;
	}

}
