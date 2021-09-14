package generics;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import products.HomeAppliance;
import products.Television;
import products.WashingMachine;
import store.Customer;
import store.Store;

public class PDFTable {



	public void createTableCustomerPDF(String PDFPath, Store store){
		try {
			Font font = new Font(Font.HELVETICA, 12, Font.BOLDITALIC);
			Document doc = new Document();
			PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream(PDFPath));
			PdfPTable table = new PdfPTable(2);
			table.setWidthPercentage(100);
			// setting column widths
			table.setWidths(new float[] {6.0f, 6.0f});
			PdfPCell cell = new PdfPCell();
			// table headers
			cell.setPhrase(new Phrase("Nome", font));
			table.addCell(cell);
			cell.setPhrase(new Phrase("Address", font));
			table.addCell(cell);
			ArrayList<Customer> customers = store.getCustomers();
			// adding table rows
			for(Customer customer : customers) {
				table.addCell(customer.getNome());
				table.addCell(customer.getResidence().toString());
			}
			doc.open();
			// adding table to document
			doc.add(table);
			doc.close();
			writer.close();
			System.out.println("PDF using OpenPDF created successfully");
		} catch (DocumentException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void createTableHomeAppliancePDF(String PDFPath, Store store,HomeAppliance homeAppliance){
		try {
			Font font = new Font(Font.HELVETICA, 12, Font.BOLDITALIC);
			Document doc = new Document();
			PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream(PDFPath));
			PdfPTable table = new PdfPTable(HomeAppliance.getNumberField());
			table.setWidthPercentage(100);
			// setting column widths
			float[] scheme = new float[HomeAppliance.getNumberField()];
			for (int i = 0; i < scheme.length; i++) {
				scheme[i]=6.0f;
			}
			table.setWidths(scheme);
			PdfPCell cell = new PdfPCell();
			// table headers
			for (int i = 0; i < HomeAppliance.getNumberField(); i++) {
				if(homeAppliance instanceof Television)
					cell.setPhrase(new Phrase(Television.getField(i), font));
				else
					cell.setPhrase(new Phrase(WashingMachine.getField(i), font));
				table.addCell(cell);	
			}
			ArrayList<HomeAppliance> homeAppliances = new ArrayList<HomeAppliance>();
			if(store.getHomeAppliances()!=null) {
				if(homeAppliance instanceof Television)
					homeAppliances = store.getTelevision();
				else
					homeAppliances = store.getWashingMachines();
			
			// adding table rows
				for(HomeAppliance appliance : homeAppliances) {
					table.addCell(appliance.getBrand());
					table.addCell(appliance.getDescription());
					table.addCell(appliance.getPrice()+"");
					table.addCell(appliance.getId());
					if(appliance instanceof Television) {
						table.addCell(((Television) appliance).getInches()+"");
						table.addCell(((Television) appliance).is8kResolution() ? "yes" : "no");
					}else {
						table.addCell(((WashingMachine) appliance).getPrograms());
						table.addCell(((WashingMachine) appliance).getCargoCapacity()+"");
					}
				}
			}
			doc.open();
			// adding table to document
			doc.add(table);
			doc.close();
			writer.close();
			System.out.println("PDF using OpenPDF created successfully");
		} catch (DocumentException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void createTableSalesPDF(String PDFPath, Store store,int sales){
		try {
			Font font = new Font(Font.HELVETICA, 12, Font.BOLDITALIC);
			Document doc = new Document();
			PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream(PDFPath));
			PdfPTable table = new PdfPTable(2);
			table.setWidthPercentage(100);
			// setting column widths
			table.setWidths(new float[] {6.0f, 6.0f});
			PdfPCell cell = new PdfPCell();
			// table headers
			cell.setPhrase(new Phrase("Sales", font));
			table.addCell(cell);
			cell.setPhrase(new Phrase("Date", font));
			table.addCell(cell);
			// adding table rows
			for (int i = 0; i < sales; i++) {
				table.addCell(store.sell());
				table.addCell(LocalDate.now().toString());
			}
			doc.open();
			// adding table to document
			doc.add(table);
			doc.close();
			writer.close();
			System.out.println("PDF using OpenPDF created successfully");
		} catch (DocumentException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}