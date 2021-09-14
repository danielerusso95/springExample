package it.softwareinside.jaazza.coffeemachine;

import it.softwareinside.jaazza.drink.Bevanda;
import it.softwareinside.jaazza.drink.Ingredienti;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class AutomaticCoffeeMachine extends MacchinaDelCaffe{
	private int maxRicariche;

	public AutomaticCoffeeMachine(int maxRicariche) {
		if(maxRicariche>0)this.maxRicariche=maxRicariche;
		else this.maxRicariche=1;
	}

	/**
	 * il metodo eroga(nomeBevanda) effettua l’override del metodo corrispondente della superclasse, ed
	 * implementa il comportamento di ricarica automatica come segue. Il metodo eroga il prodotto richiesto. In
	 * caso di successo dell’erogazione, il metodo verifica se gli ingredienti disponibili sono ancora sufficienti per
	 * l’erogazione di un’altra bevanda uguale a quella appena erogata, e in caso di risultato negativo della verifica
	 * procede ad effettuare la ricarica, aggiornando il numero di ricariche che possono essere ulteriormente
	 * effettuate
	 */
	@Override
	public boolean supply(String drinkName) {
		if(this.getDrinks()==null) return false;
		for (Bevanda d : this.getDrinks())
			if(drinkName.equals(d.getNome()) && 
					this.getCreditoUtente() >= d.getCostoInCentesimi() &&
					this.getIngredients().ingredientiSufficienti(d)) 
			{
				this.getIngredients().consuma(d);
				this.setCreditoUtente(this.getCreditoUtente()-d.getCostoInCentesimi());
				this.automaticRefill(d);
				return true;
			}
		return false;
	}

	public void automaticRefill(Bevanda drink) {
		if(!(this.getCreditoUtente()>drink.getCostoInCentesimi()))
			if(maxRicariche>0) {
				this.setIngredients(new Ingredienti());
				this.maxRicariche--;
			}
	}
}
