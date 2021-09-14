//import static org.junit.jupiter.api.Assertions.*;
//
//import generics.Address;
//import generics.PDFTable;
//import products.Television;
//import products.WashingMachine;
//import store.Customer;
//import store.Store;
//
//class Test {
//
//	@org.junit.jupiter.api.Test
//	void test() {
//		Address address1 = new Address("ciao", "bho", 1);
//		Address address2 = new Address("co", "bo", 2);
//		Address address3 = new Address("csdfdo", "bdvdo", 5);
//		Store store1 = new Store("cuccioli",address1);
//		WashingMachine lavatrice = new WashingMachine("sony","washing",100.50,"freddi,caldi,delicati",20);
//		Customer customer1 = new Customer(address2,"carlo");
//		Television televisione = new Television("lg","smart tv",549.99,45.5,false);
//		Customer customer2 = new Customer(address1,"ciro");
//		Television televisione2 = new Television("toshiba","smart tv",509.99,45.5,false);
//		Customer customer3 = new Customer(address3,"daniele");
//		Television televisione3 = new Television("apple","smart tv",1049.99,45.5,false);
//		Customer customer4 = new Customer(address1,"anthea");
//		
//		store1.insertHomeAppliance(lavatrice);
//		store1.insertCustomer(customer1);
//		store1.insertHomeAppliance(televisione);
//		store1.insertCustomer(customer2);
//		store1.insertHomeAppliance(televisione2);
//		store1.insertCustomer(customer3);
//		store1.insertHomeAppliance(televisione3);
//		store1.insertCustomer(customer4);
//		
//	    new PDFTable().createTableCustomerPDF("./docs/customerTable.pdf",store1);
//	    new PDFTable().createTableHomeAppliancePDF("./docs/WashingMachineTable.pdf",store1,new WashingMachine());
//	    new PDFTable().createTableSalesPDF("./docs/salesTable.pdf",store1,3);
//	    new PDFTable().createTableHomeAppliancePDF("./docs/TelevisionTable.pdf",store1,new Television());
//	}
//
//}
