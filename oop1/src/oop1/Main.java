package oop1;

public class Main {

	public static void main(String[] args) {
		

		Product product = new Product();
		product.setName("Delonghi Kahve Makinesi");
		product.setDiscount(7);
		product.setUnitPrice(7500);
		product.setUnitsInStock(3); 
		product.setImageUrl( "bilmemne.jpg");
		
		Product product1 = new Product();
		product1.setName("Smeg Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl( "bilmemne1.jpg");
		
		Product product2 = new Product();
		product2.setName("Kitchen Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl( "bilmemne2.jpg");
		
		Product[] products = { product, product1, product2 };

		System.out.println("<ul>");
		for (Product product3 : products) {
			System.out.println("<li>" + product3.getName() + "</li>");

		}
		System.out.println("</ul>");
		
		
		
		
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05555555555");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Tolgay");
		individualCustomer.setLastName("Bozdogan");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("0312 312 12");
		corporateCustomer.setTaxNumber("111111111111");
		corporateCustomer.setCustomerNumber("54321");
	
		Customer[] customers = {individualCustomer, corporateCustomer};
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// set
		/*
		 * product.name = "Delonghi Kahve Makinesi";
		product.unitPrice = 7500;
		product.discount = 7;
		product.unitsInStock = 3;
		product.imageUrl = "bilmemne.jpg";

		// get
		// System.out.println(product.name);

		Product product1 = new Product();
		product1.name = "Smeg Kahve Makinesi";
		product1.unitPrice = 6500;
		product1.discount = 8;
		product1.unitsInStock = 2;
		product1.imageUrl = "bilmemne1.jpg";

		Product product2 = new Product();
		product2.name = "Kitchen Kahve Makinesi";
		product2.unitPrice = 4500;
		product2.discount = 9;
		product2.unitsInStock = 4;
		product2.imageUrl = "bilmemne2.jpg";

		Product[] products = { product, product1, product2 };

		System.out.println("<ul>");
		for (Product product3 : products) {
			System.out.println("<li>" + product3.name + "</li>");

		}
		System.out.println("</ul>");
		 */

	}

}
