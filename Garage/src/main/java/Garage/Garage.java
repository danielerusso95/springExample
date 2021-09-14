package Garage;

import java.util.ArrayList;


import Vehicles.Car;

public class Garage {
	public ArrayList<Car> vehicles = new ArrayList<Car>();
	
	public Garage() {
		
	}
	
	public Garage( ArrayList<Car> cars ) {
		
		this.vehicles = cars;
	}
	
	public void addVehicles(Car cars) {
		this.vehicles.add(cars);
	}
	public void removeVehicles(Car cars) {
		this.vehicles.remove(cars);
	}
	public void getVehicles(int box) {
		System.out.println(this.vehicles.get(box).marca);
		System.out.println(this.vehicles.get(box).cilindrata);
	}
	public void printVehicles() {
		for(Car cars:this.vehicles) {
			System.out.println(cars.marca);
			System.out.println(cars.cilindrata);
			System.out.println("");
		}
	}
	public int howManyVehicles() {
		return this.vehicles.size();
	}
}
