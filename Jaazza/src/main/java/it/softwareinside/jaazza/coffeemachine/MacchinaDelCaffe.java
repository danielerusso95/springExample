package it.softwareinside.jaazza.coffeemachine;

import java.util.ArrayList;
import java.util.Scanner;

import it.softwareinside.jaazza.drink.Bevanda;
import it.softwareinside.jaazza.drink.Ingredienti;
import lombok.Data;

@Data
public class MacchinaDelCaffe {
	private int creditoUtente;
	private ArrayList<Bevanda> drinks;
	private Ingredienti ingredients;
	private Scanner scan ;

	public MacchinaDelCaffe() {
		this.drinks=new ArrayList<Bevanda>();
		this.ingredients=new Ingredienti();
		this.creditoUtente=0;
		this.scan = new Scanner(System.in);
	}
	/**
	 * il metodo inserisciCentesimi(centesimi) corrisponde all’inserimento di monete da parte dell’utente e
	 * incrementa il credito utente del numero di centesimi inseriti (se negativo, il metodo non fa nessuna modifica
	 * al credito utente)
	 * @param money
	 */
	public void inserisciCentesimi(int money) {
		if(money>0) this.creditoUtente+=money;
	}
	/**
	 * il metodo restituisciCreditoUtente() azzera il credito utente, restituendo come valore di ritorno il numero di
	 * centesimi disponibili
	 * @return
	 */
	public int restituisciCreditoUtente() {
		int money = this.creditoUtente;
		this.creditoUtente=0;
		return money;
	}

	/**
	 * il metodo aggiungiBevanda(bevanda) inserisce un nuovo elemento nella collezione di bevande, a meno che
	 * l’elemento non sia già presente. Restituisce true se l’inserimento avviene con successo, false in caso
	 * contrario
	 * @param drink
	 * @return
	 */
	public boolean aggiungiBevanda(Bevanda drink) {
		if(drinks.isEmpty()) {
			drinks.add(drink);
			return true;
		}else
			for (Bevanda d : drinks) {
				if(drink.equals(d)) return false;
				else {
					drinks.add(drink);
					break;
				}
			}
		return true;
	}
	/**
	 * il metodo modificaBevanda(bevanda) modifica una bevanda esistente, che deve essere quindi già presente
	 * nella collezione. Restituisce true se la modifica avviene con successo, false in caso contrario
	 * @param drink
	 * @return
	 */
	public boolean modificaBevanda(Bevanda drink) {
		if(drinks.isEmpty()) return false;
		else
			for (Bevanda d : drinks)
				if(drink.equals(d)) {
					d=drink;
					return true;
				}
		return false;
	}

	/**
	 * il metodo ricaricaIngredienti() ricostituisce la disponibilità iniziale di ingredienti
	 */
	public void ricaricaIngredienti() {
		this.ingredients = new Ingredienti();
	}

	/**
	 * il metodo eroga(nomeBevanda) eroga la bevanda con il nome indicato. Se l’erogazione può avvenire (la
	 * bevanda prescelta è parte della collezione di bevande, il credito utente è sufficiente, e c’è sufficiente
	 * disponibilità di ingredienti) il metodo aggiorna la disponibilità di ingredienti e il credito utente in base a
	 * quanto erogato e restituisce true. Se il credito utente non è sufficiente o la bevanda indicata non esiste o la
	 * disponibilità di ingredienti non è sufficiente, il metodo restituisce false.
	 */
	public boolean supply(String drinkName) {
		if(drinks==null) return false;
		for (Bevanda d : drinks)
			if(drinkName.equals(d.getNome()) && 
					this.creditoUtente >= d.getCostoInCentesimi() &&
					this.ingredients.ingredientiSufficienti(d)
					) 
			{
				this.ingredients.consuma(d);
				this.creditoUtente-=d.getCostoInCentesimi();
				return true;
			}
		return false;
	}
	/**
	 * Il metodo compilaQuestionarioSoddisfazione() funziona interattivamente e restituisce un array di interi che
	 * esprimono un voto dell’utente (da 1 a 5, o 0 nel caso di giudizio inespresso) per le bevande erogate dal
	 * distributore. Per ogni bevanda erogabile, il metodo chiede all’utente se vuole esprimere un giudizio. Se si’,
	 * viene chiesto il voto, reiterando la richiesta fino a che non viene inserito un voto valido (ovvero un valore fra
	 * 1 e 5). Alla fine il metodo stampa a video il valore del massimo, del minimo e della media aritmetica dei voti
	 * inseriti (senza contare i giudizi inespressi) e restituisce l’array con i voti.
	 */
	public int[] rateDrinks() {
		int[] rates = new int [drinks.size()];
		for (int i = 0; i < drinks.size(); i++) {
			rates[i]=rateDrink(drinks.get(i));
		}
		scan.close();
		return rates;
	}
	public int rateDrink(Bevanda drink) {
		int rate = -1;
		while(rate<0) {
			System.out.println("Quanto valuti "+drink.getNome()+" ?");
			rate = scan.nextInt();
		}
		return rate;
	}
}
