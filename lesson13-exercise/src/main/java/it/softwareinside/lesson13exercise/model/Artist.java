package it.softwareinside.lesson13exercise.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="artist")
public class Artist {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="surname")
	private String surname;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="numWorks")
	private int numWorks;
	
	public 	Artist(String name, String surname, Date date, int numWorks) {
		this.name = name;
		this.surname = surname;
		this.date = date;
		this.numWorks = numWorks;

	}
}
