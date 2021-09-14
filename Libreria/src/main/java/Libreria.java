import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Libreria {
	public ArrayList<Libro> libreria;
	
	public Libreria(ArrayList<Libro> libreria) {
		this.libreria=libreria;
	}

	public void printBooks() {
		for(Libro libro:libreria) {
			System.out.print(libro.titolo +"\n");
			System.out.print(libro.numeroPagine+"\n");
			System.out.println(libro.autore.name + libro.autore.surname +"\n");
		}
	}

	public void addBook(Autore autore,int numeroPagine,String titolo){
		Libro book=new Libro(autore,numeroPagine,titolo);
		int contPages=0;
		if(libreria.isEmpty() && numeroPagine<1000) {
			libreria.add(book);
			System.out.println("libro aggiunto");
		}
		else {
			for(Libro libro : libreria) {
				contPages+=libro.numeroPagine;
			}
			if(contPages+book.numeroPagine<1000) {
				libreria.add(book);
				System.out.println("libro aggiunto");
			}else System.out.println("errore,limite pagine superato");;
		}
	}
	public Libro removeLibro(int posizione) {
		 
		//check ! Non cadere in Execption!
		if(posizione >= this.libreria.size() || posizione  < 0)
			return null;
 
		Libro lib = this.libreria.get(posizione);
		this.libreria.remove(posizione);
 
		return lib;
	}
	
		
}
