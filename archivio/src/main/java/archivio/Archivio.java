package archivio;

import java.util.ArrayList;

import document.Document;
import lombok.Data;



@Data


public class Archivio {
	private ArrayList <Document> docs = new ArrayList<Document>();
	
	public int addDoc(Document doc) {
		if(doc==null) return -1;
		else{
			docs.add(doc);
			return -1;
		}
	}
	public Document bestDoc() {
		int best = 0;
		double quality=docs.get(0).calcolaQualita();
		for (int i = 0; i < docs.size(); i++) {
			if(docs.get(i).calcolaQualita()>quality) {
				quality=docs.get(i).calcolaQualita();
				best=i;
			}
		}
		return docs.get(best);
	}
	
	

}
