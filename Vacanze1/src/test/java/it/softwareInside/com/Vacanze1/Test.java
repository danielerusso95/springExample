package it.softwareInside.com.Vacanze1;


import it.softwareInside.com.Vacanze1.model.Coach;
import it.softwareInside.com.Vacanze1.model.Team;
import it.softwareInside.com.Vacanze1.service.Service;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		Service s = new Service();
		Coach c = new Coach("luca");
		
		Team t = new Team("Milan",3,c);
		s.insertTeam(t);
		
		
		
		
		
		
	}

}
