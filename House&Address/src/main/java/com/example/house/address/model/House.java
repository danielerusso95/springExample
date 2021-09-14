package com.example.house.address.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name="house")
public class House {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int houseId;
	@Column(name="area")
	private double area;
	
	
	@Column(name="type")
	private String type;
	
	@OneToOne(targetEntity=Address.class,cascade=CascadeType.ALL)
	private Address address;

	public House(double area, String type, Address address) {
		this.area = area;
		this.type = type;
		this.address = address;
	}

	
	
	
}	
	
	

