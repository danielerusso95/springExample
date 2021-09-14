package it.softwareinside.management.dentist.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="customer")
public class Customer {

	@Id
	@Column(length = 16)
	private String cf;
	@Column(name="name")
	private String name;
	@Column(name="surname")
	private String surname;
	@Column(name="phoneNumber")
	private String phoneNumber;
	@Column(name="email")
	private String email;
	@Column(name="dob")
	private Date dob;

}
