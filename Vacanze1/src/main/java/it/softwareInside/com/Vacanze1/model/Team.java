package it.softwareInside.com.Vacanze1.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="Team")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Team {
	
	@Id
	@Column(name="nome")
	private String nome;
	
	@Column(name="trofei")
	private int trofei;
	
	@OneToOne(targetEntity=Coach.class,cascade=CascadeType.ALL)  
	@JoinColumn(name="id_coach")
	private Coach coach;
	
	
	
}
