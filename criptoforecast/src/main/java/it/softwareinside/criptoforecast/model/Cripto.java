package it.softwareinside.criptoforecast.model;



import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor

public class Cripto {
	@JsonAlias("cripto")
	private ArrayList<Double> cripto;
	
	public Cripto() {
		this.cripto = new ArrayList<Double>();
	}
}
