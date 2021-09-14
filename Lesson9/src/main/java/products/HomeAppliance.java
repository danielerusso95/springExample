package products;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HomeAppliance {
	protected String id;
	private String description;
	private String brand;
	private double price;
	

	public HomeAppliance(String brand,String description, double price) {
		this.brand = brand;
		this.description = description;
		this.price = price;
		setId();
	}
	
	/**
	 * genera un id per ogni prodotto
	 */
	public void setId() {
		this.id= UUID.randomUUID().toString();
	}
	
	/**
	 * ritorna il numero di campi per la creazione della tabella
	 * @return
	 */
	public static int getNumberField() {
		return 6;
	}

	public static String getField(int index) {
		String[] fields = {"brand","description","price","id"};
		return fields[index];
	}
}
