import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Autore {
	
	
	public String name,surname;
	
	public Autore(String name, String surname) {
		this.name=name;
		this.surname=surname;
	}
	

}
