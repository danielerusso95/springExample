package archivio;




import document.Document;
import document.DocumentoPrioritario;

public class test {


	public test() {
		Archivio arch = new Archivio();
		arch.addDoc(new Document("ciaociaociao"));
		arch.addDoc(new Document("ciaociao"));
		arch.addDoc(new Document("ciao"));
		arch.addDoc(new DocumentoPrioritario("ciao",4));
		arch.addDoc(new DocumentoPrioritario("ciao",1));
	}

}
