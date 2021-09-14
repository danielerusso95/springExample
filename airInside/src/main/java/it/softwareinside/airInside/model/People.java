package it.softwareinside.airInside.model;

import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="people")
public class People {
	
	public People(String name,  int age, String email) {
		Random rand = new Random();
		char[] chars= {'A','B','C','D','E','F','G','1','2','3','4'};
		for (int i = 0; i < 16; i++) {
			this.cf += chars[rand.nextInt(11)];
		}

		this.name = name;
		this.age = age;
		this.email = email;
	}


	@NotNull(message = "cf cannot be null")
	@Id
	@Column(name="cf",length=16)
	private String cf;

	
	@Column(name="role")
	public String role;

	@NotNull
	@Column(name="name")
	private String name;

	@NotNull
	@Column(name="age")
	private int age;

	@Email
	@Column(name="email")
	private String email;

}
