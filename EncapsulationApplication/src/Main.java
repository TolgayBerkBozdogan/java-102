
public class Main {

	public static void main(String[] args) {
		Person person = new Person();
		person.firstName = "Ali";
		person.lastName = "Veli";
		person.age=23;
		//person.email = "aliveli";
		
		person.setEmail("aliveli");
		System.out.println(person.getEmail());
		person.setEmail("aliveli@gmail.com");
		System.out.println(person.getEmail());
		
		Product product = new Product("Beats", "Solo", 230, "DarkBlue");
		System.out.println(product.brand+" "+product.model+" "+product.stockAmount+" " +product.color );
			
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		
		

	}

}
 
