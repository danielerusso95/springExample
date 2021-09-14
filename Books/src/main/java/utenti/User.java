package utenti;

import java.util.ArrayList;

import libri.Book;
import lombok.AllArgsConstructor;
import lombok.Data;



@Data
@AllArgsConstructor
public class User {
	private String name;
	private int maxPages;
	protected ArrayList <Book> books = new ArrayList<Book>();
	
	public User(String name,int maxPages) {
		this.name=name;
		this.maxPages=maxPages;
		this.books = new ArrayList<Book>();
	}
	/**
	 * 
	 * conta le pagine che l'utente ha occupato
	 * @return int
	 */
	
	public int pagesBorrow() {
		int count=0;
		for(Book book:books) {
			count+=book.getPages();
		}
		return count;
		
	}
	/**
	 * Passato un libro lo si aggiunge alla lista dell'utente
	 * controllando se l'utente ha ancora a disposizione pagine libere 
	 * @param book
	 * @return boolean
	 */
	public boolean borrow(Book book) {
		if(this.pagesBorrow()+book.getPages()>maxPages) return false;
		else books.add(book);
		return true;	
	}
	
	/**
	 * rimuove il primo libro dalla lista dell'utente
	 * @return
	 */
	public Book returnBook() {
		return this.books.isEmpty() ? null : this.books.remove(0);
	}
	
	public String toString() {
		return name+" "+maxPages+" "+pagesBorrow()+getBooks();
	}
}
