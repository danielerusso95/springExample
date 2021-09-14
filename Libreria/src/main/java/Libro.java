import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Libro {
	public Autore autore;
	public int numeroPagine;
	public String titolo;
	
	public Libro(Autore autore, int numeroPagine, String titolo) {
		this.autore = autore;
		this.numeroPagine = numeroPagine;
		this.titolo=titolo;
	}
}
