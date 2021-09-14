package it.softwareinside.smista;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;


public class CreatePdf {


	private Document document;
	private Scanner keyboard;

	public void PDFManager(String nomeFile) {

		this.document = new Document();
		this.keyboard = new Scanner(System.in);

		try {
			PdfWriter.getInstance(document,
					new FileOutputStream(nomeFile));

			document.open();
		} catch (DocumentException e) {

			e.printStackTrace();


		} catch (FileNotFoundException e) {

			e.printStackTrace();


		}

	}


	public void write(String string) {

		String paragrafo = "";

		paragrafo += string + " ";

		System.out.println(paragrafo);
		this.document.add(new Paragraph(paragrafo));
	}



	public void close() {
		this.document.close();
		this.keyboard.close();
	}


}

