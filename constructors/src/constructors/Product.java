package constructors;

public class Product {
	public String name;
	public String model;
	public int price;
	public int stockAmount;
	
	public Product() {
		this("Macbook ","Pro ",20000, 98);
		/*this.name=name;
		this.model=model;
		this.price=price;
		this.stockAmount=stockAmount;
		*/
	}
	
	public Product(String name, String model, int price, int stockAmount) {
		this.name=name;
		this.model=model;
		this.price=price;
		this.stockAmount=stockAmount;
	}
	
	

}
