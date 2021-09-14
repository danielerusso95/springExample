package products;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
public class WashingMachine extends HomeAppliance{
	private String programs;
	private int cargoCapacity;
	
	public WashingMachine(String brand,String description,double price,String programs,int cargoCapacity) {
		super(brand,description,price);
		this.programs=programs;
		this.cargoCapacity=cargoCapacity;
	}
	
	/**
	 * metodo che accetta un indice e ritorna uno dei campi della classe
	 * per riempire i campi della tabella per il file pdf
	 * @param index
	 * @return
	 */
	public static String getField(int index) {
		String[] fields = {"brand","description","price","id","programs","cargoCapacity"};
		return fields[index];
	}
	
	
	@Override 
	public String toString() {
		return this.getBrand()+" "+this.getDescription()+" "+this.getPrice();
	}
}
