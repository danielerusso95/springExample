package it.softwareinside.race.autodrome;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Autodrome {
	private int maxCar;
	private ArrayList<Car> cars;


	public Autodrome() {
		Random rand = new Random();
		this.maxCar = rand.nextInt(20)+10;
		this.cars = new ArrayList<Car>();
		this.fillAutodrome(rand.nextInt(maxCar));
	}

	
	/**
	 * Metodo che simula una corsa solo nel caso ci siano almeno due auto
	 * @return
	 */
	public Car[] race() {
		if(cars.size()>=2)
			Collections.shuffle(cars);
		else return null;
		Car[] winnerCars = {cars.get(0),cars.get(1)};
		return winnerCars;
	}

	/**
	 * Metodo che ti mostra tutte le auto presenti nell'autodromo
	 */
	public void showCar() {
		if(cars==null) System.out.println("non ci sono auto");
		else {
			for (Car car : cars) {
				System.out.println(car.toString());
			}
		}
	}

	public void showCar(String brand) {
		if(cars==null) System.out.println("non ci sono auto");
		else 
			for (Car car : cars) 
				if(car.getBrand().equals(brand))
					System.out.println(car.toString());
	}

	public boolean insertCar(Car car) {
		if(cars.size()<maxCar)
			if(checkBrandCars(car.getBrand())) {
				cars.add(car);
				return true;
			}
		return false;
	}

	public boolean checkBrandCars(String brand) {
		if(cars==null) return false;
		else {
			int count = 0;
			for (Car car : cars) {
				if(car.getBrand().equals(brand))
					count++;
			}
			if(count>1) return false;
			else return true;
		}
	}

	public void fillAutodrome(int numberCars) {
		if(cars.size()+numberCars<maxCar)
			for (int i = 0; i < numberCars; i++) {
				cars.add(new Car());
			}
	}
}
