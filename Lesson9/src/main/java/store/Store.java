package store;
import java.util.ArrayList;
import java.util.Random;

import generics.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import products.HomeAppliance;
import products.Television;
import products.WashingMachine;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Store {
	private Address address;
	private int maxOccupancy;
	private String name;
	private ArrayList<HomeAppliance> homeAppliances; 
	private ArrayList<Customer> customers; 


	public Store(String name, Address address) {
		Random rand = new Random();
		this.name=name;
		this.address=address;
		this.maxOccupancy=rand.nextInt(50);
		this.homeAppliances = new ArrayList<HomeAppliance>();
		this.customers = new ArrayList<Customer>();
	}

	/**
	 * Metodo che mostra tutti i clienti
	 */
	public void showAllCustomers() {
		if(!customers.isEmpty())
			for (Customer customer : customers) 
				System.out.println(customer);
		else System.out.println("Non ci sono clienti");
	}
	/**
	 * Metodo che mostra tutte le lavatrici
	 */
	public void showAllWashingMachine() {
		if(!homeAppliances.isEmpty())
			for (HomeAppliance homeAppliance : homeAppliances)
				if(homeAppliance instanceof WashingMachine) 
					System.out.println(homeAppliance);
				else System.out.println("Non ci sono lavatrici");
	}
	/**
	 * Metodo che mostra tutti i televisori
	 */
	public void showAllTelevisions() {
		if(!homeAppliances.isEmpty())
			for (HomeAppliance homeAppliance : homeAppliances)
				if(homeAppliance instanceof Television)
					System.out.println(homeAppliance);
				else System.out.println("Non ci sono televisori");
	}
	/**
	 * Metodo che mostra tutti gli elettrodomestici
	 */
	public void showAllHomeAppliances() {
		showAllWashingMachine();
		showAllTelevisions();
	}
	/**
	 * Metodo per inserire un cliente
	 */
	public boolean insertCustomer(Customer customer) {
		if(customers.size()<=maxOccupancy) {
			customers.add(customer);
			return true;
		}else return false;
	}
	/**
	 * Metodo per inserire un elettrodomestico
	 */
	public boolean insertHomeAppliance(HomeAppliance homeAppliance) {
		if(homeAppliance!=null && homeAppliances.size()<this.maxOccupancy) {
			homeAppliances.add(homeAppliance);
			return true;
		}else return false;
	}
	/**
	 * Metodo che simula una vendita in modo randomico
	 */
	public String sell() {
		Random rand = new Random();
		if((!customers.isEmpty() || !homeAppliances.isEmpty())) {
			
			Customer customer = customers.get(rand.nextInt(customers.size()-1));
			Customer customer1 = customer;
			HomeAppliance homeAppliance = homeAppliances.get(rand.nextInt(homeAppliances.size()-1));
			HomeAppliance homeAppliance1 = homeAppliance;
			customers.remove(customer);
			homeAppliances.remove(homeAppliance);
			if(customer!=null && homeAppliance!=null)
				return "Il cliente "+customer1.toString()+" ha comprato "+"\n"+homeAppliance1.toString();
		}
		return "";
		
	}
	public ArrayList<HomeAppliance> getTelevision(){
		ArrayList<HomeAppliance> televisions = new ArrayList<HomeAppliance>();
		if(!homeAppliances.isEmpty())
			for (HomeAppliance homeAppliance : homeAppliances)
				if(homeAppliance instanceof Television)
					televisions.add((Television) homeAppliance);
		return televisions;
	}
	public ArrayList<HomeAppliance> getWashingMachines(){
		ArrayList<HomeAppliance> washingMachines = new ArrayList<HomeAppliance>();
		if(!homeAppliances.isEmpty())
			for (HomeAppliance homeAppliance : homeAppliances)
				if(homeAppliance instanceof WashingMachine)
					washingMachines.add((WashingMachine) homeAppliance);
		return washingMachines;
	}
}






//vendi cosa e a chi
//inserisci elettrodomestici