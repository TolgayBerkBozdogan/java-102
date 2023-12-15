
public class ProductManager {
	
	public void add(Product product) {
		System.out.println("Product added to data base ");
		product.setId("BeatsSoloWireless1");
		System.out.println("Product's ID: "+product.getId());
		
	}

}
