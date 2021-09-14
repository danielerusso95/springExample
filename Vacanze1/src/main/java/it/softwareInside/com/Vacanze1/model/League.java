package it.softwareInside.com.Vacanze1.model;

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
@Entity
@Table(name="League")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class League {

	@Id
	@Column(name="nome")
	private String nome;
	
	@Column(name="numero_squadre")
	private int numSquadre;
	
	@OneToMany(cascade = CascadeType.ALL)  
	@JoinColumn(name="nome_league") 
	private List<Team> team;
}
