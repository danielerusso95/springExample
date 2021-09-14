package it.softwareinside.coffeeAgency.coffeeMachine;

import lombok.Data;

@Data
public class Ingredient {
	public class Ingredienti {
		public static final int QNT_INIZIALE = 10;
		private int caffe;
		private int latte;
		private int cacao;
		private int zucchero;
	 
		public Ingredienti() {
			riempi();
		}
	 
		public void riempi(){
			this.caffe = QNT_INIZIALE;
			this.latte = QNT_INIZIALE;
			this.cacao = QNT_INIZIALE;
			this.setZucchero(QNT_INIZIALE);
		}

		public int getZucchero() {
			return zucchero;
		}

		public void setZucchero(int zucchero) {
			this.zucchero = zucchero;
		}

	}
}
