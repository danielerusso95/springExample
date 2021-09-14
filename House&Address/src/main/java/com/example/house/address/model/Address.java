package com.example.house.address.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name="address")
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int houseId;
	@Column(name="street")
	private String street;
	@Column(name="num")
	private int num;
	public Address(String street, int num) {
		this.street = street;
		this.num = num;
	}
}
