package it.softwareinside.race.autodrome;

import java.util.Random;

import it.softwareinside.race.pilot.Pilot;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {
	private String brand;
	private int currentV;
	private int maxV;
	private Pilot pilot;
	private String[] brands = {"ferrari","lamborghini","redbull","tesla","volvo","mclarens"};
	private String[] names = {"carlo","giacomo","luca","ciro","giuseppe","olmo"};
	
	
	public Car() {
		Random rand = new Random();
		this.brand= getRandomString(brands);
		this.currentV = rand.nextInt(100);
		this.pilot = new Pilot(getRandomString(names),rand.nextInt(10)+1);
		if(pilot.getExperience()>4)
			this.maxV = rand.nextInt(300)+20;
		else
			this.maxV = rand.nextInt(300)-20;
		
	}
	
	public String getRandomString(String[] strings) {
		
		Random rand = new Random();
		return strings[rand.nextInt(strings.length)];
	}
	
	@Override
	public String toString() {
		return "La "+this.brand+" con velocità corrente di "+this.currentV+" e velocità massima di "+this.maxV+" con "+this.pilot.toString();
	}
	
}
