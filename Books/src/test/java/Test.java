import static org.junit.Assert.*;

import libri.Book;
import libri.Magazine;
import utenti.SubscriberUser;
import utenti.User;

public class Test {

	@org.junit.Test
	public void test() {
		User user1 = new SubscriberUser("Mario Rossi",600);
		Book magazine = new Book("magazine1",200);
		Book magazine1 = new Book("magazine1",200);
		Book magazine2 = new Magazine("magazine1",200,1);
		Book magazine3 = new Book("magazine1",200);
		user1.borrow(magazine);
		user1.borrow(magazine1);
		user1.borrow(magazine2);
		assertTrue(user1.borrow(magazine3));
		System.out.println(user1.toString());
	}

}
