package it.softwareinside.race.pilot;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pilot {
	private String name;
	private int experience;
	
	public String toString() {
		return "il pilota "+name+" che ha "+experience+" anni di esperienza";
	}
}
