package products;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
public class Television extends HomeAppliance {
	private double inches;
	private boolean is8kResolution;
	
	public Television(String brand,String description,double price,double inches,boolean is8kResolution) {
		super(brand,description, price);
		this.inches=inches;
		this.is8kResolution=is8kResolution;
	}
	/**
	 * metodo che accetta un indice e ritorna uno dei campi della classe
	 * per riempire i campi della tabella per il file pdf
	 * @param index
	 * @return
	 */
	public static String getField(int index) {
		String[] fields = {"brand","description","price","id","inches","is8kResolution"};
		return fields[index];
	}
	
	@Override 
	public String toString() {
		return this.getBrand()+" "+this.getDescription()+" "+this.getPrice();
	}
}
