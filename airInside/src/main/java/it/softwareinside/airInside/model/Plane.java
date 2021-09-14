package it.softwareinside.airInside.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
@Entity
@Table(name="plane")
public class Plane {


	@Id()
	@Column(name="code",length=15)
	private String codePlane;

	@OneToOne(cascade=CascadeType.ALL)
	private Captain captain;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="people")  
	private List<People> people;
	
	@Column(name="max_people")
	private int maxPeople; 
	
	public Plane() {
		Random rand = new Random();
		this.maxPeople=100;
		char[] chars= {'A','B','C','D','E','F','G','1','2','3','4'};
		for (int i = 0; i < 10; i++) {
			this.codePlane += chars[rand.nextInt(11)];
		}
		System.out.println(this.codePlane);
		this.people = new ArrayList<>();
	}
	

	
}
