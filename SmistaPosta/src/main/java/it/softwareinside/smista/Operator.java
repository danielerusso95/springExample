package it.softwareinside.smista;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    	Central centre = new Central("ccccc");
		Letter letter1 = new Letter("io","tu",false);
		PriorityLetter letter2 = new PriorityLetter("egli","ella",true,3);
		PriorityLetter letter3 = new PriorityLetter("esso","essa",false,3);
		PriorityLetter letter4 = new PriorityLetter("noi","voi",false,3);
		centre.receiveLetter(letter1);
		centre.receiveLetter(letter2);
		centre.receiveLetter(letter3);
		centre.receiveLetter(letter4);
		CreatePdf create = new CreatePdf();
		create.PDFManager("result.pdf");
		String result="";
		for (int i = 0; i < 4; i++) {
			result += centre.sortLetter().toString()+"\n";			
		}
		create.write(result);
		
		create.close();
	}

}
