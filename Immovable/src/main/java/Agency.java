import java.util.ArrayList;

public class Agency {

	public ArrayList<Home> houses = new ArrayList<Home>();
	
	public Agency() {
		
	}
	
	public boolean addHome(Home home) {
		return this.houses.add(home);
	}
	public boolean removeHome(Home home) {
		
		return this.houses.remove(home);
		
	}
	public void printHouses() {
		for(Home home:this.houses) {
			printHome(home);
		}
	}
	
	public void printHome(Home home) {
		System.out.println(home.name+" "+home.type+" "+home.area+" "+home.price);
	}
	
	public Home lowerPrice() {
		Home lower=  this.houses.get(0);
		for(Home home:this.houses) {
			if(home.price<lower.price) lower=home;
		}
		printHome(lower);
		return lower;
	}
	public Home higherPrice() {
		Home lower=  this.houses.get(0);
		for(Home home:this.houses) {
			if(home.price>lower.price) lower=home;
		}
		printHome(lower);
		return lower;
	}
	
	public double averagePrices() {
		double average = 0;
		for(Home home:this.houses) {
			
			average+=home.price;
		}
		average/=this.houses.size();
		System.out.println(average);
		return average;
	}
	



}
