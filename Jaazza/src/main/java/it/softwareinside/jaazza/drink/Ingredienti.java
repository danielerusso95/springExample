package it.softwareinside.jaazza.drink;
import lombok.Data;

@Data
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
		caffe = QNT_INIZIALE;
		latte = QNT_INIZIALE;
		cacao = QNT_INIZIALE;
		zucchero = QNT_INIZIALE;
	}

	public boolean ingredientiSufficienti(Bevanda bevanda) {
		if(    bevanda.getQntCaffe()<=this.caffe &&
				bevanda.getQntLatte()<=this.latte &&
				bevanda.getQntCacao()<=this.cacao &&
				bevanda.getQntZucchero()<=this.zucchero)
			return true;
		return false;
	}
	public void consuma(Bevanda bevanda) {
		if(ingredientiSufficienti(bevanda)) {
			this.caffe -= bevanda.getQntCaffe();
			this.latte -= bevanda.getQntLatte();
			this.cacao -= bevanda.getQntCacao();
			this.zucchero -= bevanda.getQntZucchero();
		}
	}
	
	
}
