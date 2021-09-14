import java.util.ArrayList;

import lombok.Data;
import lombok.Getter;
@Data
@Getter
public class test {
	
	public static ArrayList<Libro> libri = new ArrayList<Libro>();

	public static void main(String[] args) {
		
		Libreria libreria1 = new Libreria(libri);
		Autore daniele = new Autore("daniele","russo");
		libreria1.addBook(daniele, 100, "ciao");
	}

}
