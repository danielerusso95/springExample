package utenti;

import libri.Book;
import libri.Magazine;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = false)


public class SubscriberUser extends User {
	
	public SubscriberUser(String name,int maxPages) {
		super(name,maxPages);
	}
	@Override
	/**
	 * 
	 * conta le pagine che l'utente ha occupato
	 * @return int
	 */
	
	public int pagesBorrow() {
		int count=0;
		for(Book book:books) {
			if(book instanceof Magazine) continue;
			count+=book.getPages();
		}
		return count;
		
	}
	@Override
	/**
	 * aggiunge un libro alla lista utente controllando il limite
	 * delle pagine solo se il libro è un libro e non una rivista
	 */
	public boolean borrow(Book book) {
		if(book==null) return false;
		if(!(book instanceof Magazine) && this.pagesBorrow()+book.getPages()>getMaxPages()) return false;
		else books.add(book);
		return true;
	}
	public String toString() {
		return this.getName()+" "+this.getMaxPages()+" "+this.pagesBorrow()+this.getBooks();
	}
}
