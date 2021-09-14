package Garage;

import Vehicles.Car;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garage garage = new Garage();
		garage.addVehicles(new Car(1200,2016, "Ford", "Gpl", 4));
		garage.printVehicles();
	}

}
