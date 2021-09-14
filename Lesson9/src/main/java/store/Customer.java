package store;
import generics.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	private Address residence;
	private String nome;
	
	@Override
	public String toString() {
		return nome+" residente a "+residence.toString();
	}
}
