package constructors;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product();
		System.out.println(product1.name+product1.model+product1.price+" "+product1.stockAmount);
		
		Product product = new Product("Lenova ", "IdeaPad ", 12000,103);
		System.out.println(product.name+product.model+product.price+" "+product.stockAmount);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Sayi giriniz : ");
		int number = input.nextInt();
		System.out.println("Girdiginiz Sayi: " + number);     
	}																																																																																																																																																																																																																																																	

}