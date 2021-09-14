import java.util.Random;

import lombok.Data;

@Data
public class Mago implements Umano{
	private int puntiAttacco;
	private int puntiVita;
	private String nome;
	private int mp;
	private boolean isAlive;
	private Random random;
	
	public Mago(String nome) {
		setNome(nome);
		init_guerriero();
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	public void setPuntiVita(int attaccoSubito) {
		this.puntiVita -= attaccoSubito;
		 
		if(this.puntiVita <= 0)
			this.isAlive = false;
	}
	public void init_guerriero() {
		this.random = new Random();
		this.mp = 1+random.nextInt(10);
		this.puntiAttacco = 70+random.nextInt(71);
		this.puntiVita = 30+random.nextInt(31);
		this.isAlive=true;
	}
	public int attacco() {
		int danno = (this.puntiAttacco/3)+random.nextInt(30);
		return danno;
	}
	public int attaccoArma() {
		int danno = this.puntiAttacco+random.nextInt(40);
		return danno;
	}
	public int attaccoSpeciale() {
		int danno = attacco()*2;
		return danno;
	}
	public boolean exit() {
		return random.nextBoolean();
	}

	@Override
	public int getStrokes() {
		return this.mp;
	}
}