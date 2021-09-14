package it.softwareinside.smista;

import java.util.ArrayList;
import lombok.Data;

@Data

/**
 * La  classe  CentraleSmistaPosta  rappresenta  le  centrali  di  accumulo
 * e  smistamento  della posta, ognuna caratterizzata da un codice testuale
 * @author daniele
 *
 */
public class Central {
	private String centralCode;
	private ArrayList <Letter> lettersToSort;

	public Central(String code) {
		this.centralCode = code;
		this.lettersToSort =new ArrayList<Letter>();
	}

	public void receiveLetter(Letter letter) {
		if(letter!=null) lettersToSort.add(letter);
		else System.out.println("lettera non valida");
	}
	
	/**
	 * Il   metodo   smistaLettera   sceglie   una   lettera   fra   
	 * quelle   ricevute   ai   fini   dello smistamento, ritornando prima quella
	 * con priorità più alta
	 * @return
	 */
	public Letter sortLetter() {
		Letter result = null;
		if(lettersToSort.isEmpty()) return null;
		else {
			result = lettersToSort.get(0);
			for (Letter letter : lettersToSort) 
				if(result.getPriority()<letter.getPriority()) 
					result=letter;
			lettersToSort.remove(result);
			return result;
		}
	}
}
