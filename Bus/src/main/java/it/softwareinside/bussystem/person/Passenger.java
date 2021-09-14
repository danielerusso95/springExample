package it.softwareinside.bussystem.person;


import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper=false)
public class Passenger extends Person {
	public Passenger(String name,double money) {
		super(name,money);
	}
}
