package it.softwareinside.bussystem.bus;

import java.util.ArrayList;

import it.softwareinside.bussystem.person.Driver;
import it.softwareinside.bussystem.person.Passenger;
import it.softwareinside.bussystem.person.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bus {
	private double ticketCost;
	private int peopleLimit;
	private ArrayList<Person> people;

	public Bus(double ticketCost,int peopleLimit) {
		this.ticketCost = ticketCost;
		this.peopleLimit = peopleLimit;
		this.people = new ArrayList<Person>();
	}

	public boolean insertPeople(Person person) {
		if(people.size()<peopleLimit && person!=null && person.getMoney()>=ticketCost) {
			if(person instanceof Passenger) {
				person.setMoney(person.getMoney()-ticketCost);
				people.add(person);
				return true;
			}
			else
				if(!checkDriver()) {
					people.add(person);
					return true;
				}
				else {
					System.out.println("driver già a bordo");
					return false;
				}

		}else {
			System.out.println("non è possibile salire a bordo");
			return false;
		}
	}
	public boolean checkDriver() {
		if(people!=null)
			for (Person person : people)
				if(person instanceof Driver)return true;
		return false; 
	}
	public void showAll() {
		if(people!=null)
			for (Person person : people)
				System.out.println(person.getName()+" "+person.getMoney());
	}
}
