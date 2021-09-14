import java.util.Random;

import lombok.Data;

@Data
public class Monaco implements Umano{

	private int puntiAttacco;
	private int puntiVita;
	private String nome;
	private int potions;
	private boolean isAlive;
	private Random random;
	
	public Monaco(String nome) {
		setNome(nome);
		init_monaco();
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	public void setPuntiVita(int attaccoSubito) {
		this.puntiVita -= attaccoSubito;
		 
		if(this.puntiVita <= 0)
			this.isAlive = false;
	}
	public void init_monaco() {
		this.random = new Random();
		this.potions = 1+random.nextInt(10);
		this.puntiAttacco = 30+random.nextInt(71);
		this.puntiVita = 100+random.nextInt(31);
		this.isAlive=true;
	}
	public int attacco() {
		int danno = (this.puntiAttacco/3)+random.nextInt(30);
		return danno;
	}
	public int attaccoArma() {
		int cura = this.puntiAttacco+random.nextInt(40);
		this.puntiVita+=cura;
		System.out.println(cura + " ps sono stati rigenerati");
		cura=0;
		return cura;
	}
	public int attaccoSpeciale() {
		int danno = attacco()*2;
		return danno;
	}
	public boolean exit() {
		return random.nextBoolean();
	}

	@Override
	public boolean isAlive() {
		
		return this.isAlive;
	}

	@Override
	public int getPuntiVita() {
		
		return this.puntiVita;
	}
	@Override
	public int getStrokes() {
		return this.potions;
	}
}



