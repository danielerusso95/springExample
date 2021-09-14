package it.softwareinside.jaazza.drink;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class Bevanda {
	private int costoInCentesimi,qntCaffe,qntLatte,qntCacao,qntZucchero;
	private String nome;
	
	public Bevanda(String nome, int costoInCentesimi,int qntCaffe,int qntLatte, int qntCacao,int qntZucchero) {
		if((costoInCentesimi>0 && qntCaffe>0 && qntLatte>0 && qntCacao>0 && qntZucchero>0) && nome!=null) {
			setCostoInCentesimi(costoInCentesimi);
			setQntCaffe(qntCaffe);
			setQntLatte(qntLatte);
			setQntCacao(qntCacao);
			setQntZucchero(qntZucchero);
			setNome(nome);
		}
	}
	@Override
	public boolean equals(Object o) {
		if(((Bevanda) o).getNome()==this.nome)return true;
		return false;
		
	}
	@Override
	public String toString() {
		return "La bevanda"+nome+" è composta da \n"+qntCaffe+" ml di caffè \n"+
				qntLatte+" ml di latte \n"+
				qntCacao+" ml di cacao \n"+
				qntZucchero+" ml di Zucchero \n"+
				qntLatte+" ml di latte \n"+
				" e ha un costo di "+costoInCentesimi+" centesimi";
	}
}
