import static org.junit.jupiter.api.Assertions.assertFalse;

import it.softwareinside.bussystem.bus.Bus;
import it.softwareinside.bussystem.person.Driver;
import it.softwareinside.bussystem.person.Passenger;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		Bus bus1= new Bus(10,90);
		Passenger person = new Passenger("ciao",100.00);
		for (int i = 0; i < 10; i++) {
			bus1.insertPeople(person);
		}
		bus1.insertPeople(new Driver("bho",50));
		System.out.println(bus1.getPeople().size());
		assertFalse(bus1.insertPeople(new Driver("bho",50)));
		System.out.println(bus1.checkDriver());
		bus1.showAll();
	}

}
