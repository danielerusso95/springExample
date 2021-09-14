package com.example.agency.agency.model;

import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="employees")
public class Employees {
	@Id
	@Column(name="CF",length=16)
	private String CF;

	@Column(name="name")
	private String name;
	@Column(name="work")
	private String work;

	public Employees(String name,String work) {
		this.name = name;
		this.work = work;
		this.CF = createCF();
	}

	public String createCF() {
		Random rand = new Random();
		String[] str = {"ciao","bjhbsdcb","dvwdvd"};
		return str[rand.nextInt(2)];
	}
}
