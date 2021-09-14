package com.example.agency.agency.model;

import java.util.ArrayList;
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

@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
@Table(name="agency")
public class Agency {
	@Id
	@Column(name="P_IVA",length=16)
	private String P_IVA;
	@Column(name="name")
	private String name;

	@OneToMany(cascade = CascadeType.ALL) 
	@JoinColumn(name="pivaId") 
	private List<Employees> employees;

	public Agency(String p_IVA, String name) {
		P_IVA = p_IVA;
		this.name = name;
		this.employees = new ArrayList<Employees>();
	}
	
	
}
