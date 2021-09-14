package it.softwareinside.bussystem.person;


import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper=false)
public class Driver extends Person{
	public Driver(String name, double money) {
		super(name, money);
	}
}
