package it.softwareinside.demo2.model;

import java.util.ArrayList;
import java.util.Random;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {
	private String modello,marca,colore;
	private ArrayList<String> foto;
	private int prezzo;
	
	public Car() {
		initCar();
	}
	public void initCar() {
		Random rand = new Random();
		String[] brands = {"audi","fiat","bmw"};
		String[] models = {"a3","focus","panda"};
		String[] colors = {"rosso","blu","verde"};
		this.marca = brands[rand.nextInt(brands.length)];
		this.modello = models[rand.nextInt(models.length)];
		this.colore = colors[rand.nextInt(colors.length)];
		this.prezzo = 1000+rand.nextInt(30000);
		this.foto.add("https://www.artemedialab.it/wp-content/uploads/2019/04/immagini-sfondo-1-700x400.jpg");
	}
}
