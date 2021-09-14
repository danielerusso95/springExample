package Vehicles;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MotorVehicles {
	protected int annoImmatricolazione;
	public int cilindrata;
	protected String tipoAlimentazione;
	public String marca;
	
	public MotorVehicles() {
		
	}
	public MotorVehicles(int cilindrata, int annoImmatricolazione, String marca, String tipoAlimentazione) {
		this.annoImmatricolazione = annoImmatricolazione;
		this.cilindrata = cilindrata;
		this.marca = marca;
		this.tipoAlimentazione = tipoAlimentazione;
	}
}
