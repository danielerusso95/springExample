package it.softwareinside.race.main;

import it.softwareinside.race.autodrome.Autodrome;
import it.softwareinside.race.autodrome.Car;

public class Starter {

	public static void main(String[] args) {
		Autodrome autodrome = new Autodrome();
		Car[] winners = autodrome.race();
		
		System.out.println("1) "+winners[0]);
		System.out.println("2) "+winners[1]);
	}

}
