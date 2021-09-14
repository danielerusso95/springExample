import java.util.Random;

import lombok.Data;

@Data
public class Drago implements Dark {
	
	private int puntiVita;
	private int puntiOscurita;
	private int puntiMalvagita;
	private boolean isAlive;
	private Random random;
	
	public Drago() {
		this.random = new Random();
		init_drago();
	}
	
	private void init_drago() {
		this.puntiMalvagita = random.nextInt(10);
		this.puntiOscurita = puntiMalvagita+random.nextInt(100)+40;
		this.puntiVita = 150+ random.nextInt(130);
		this.isAlive = true;
	}
	
	public void setPuntiVita(int dannoSubito) {
		this.puntiVita -= dannoSubito;
		 
		if(this.puntiVita <= 0)
			this.isAlive = false;
	}
	
	@Override
	public int attacco() {
		return (this.puntiMalvagita/2)+random.nextInt(puntiOscurita);
	}

	@Override
	public int attaccoOscuro() {
		// TODO Auto-generated method stub
		return attacco()*2;
	}

}
