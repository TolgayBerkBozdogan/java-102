package test;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		double r;
		double pi= 3.14;
		double a;
		Scanner input = new Scanner(System.in);
		System.out.print("Dairenin çapini giriniz: ");
		r=input.nextDouble();
		System.out.print("Dairenin merkez acisinin olcusunu giriniz: ");
		a = input.nextDouble();
		double alan = pi*r*r;
		double cevre = 2*pi*r;
		double dilim = (pi*(r*r)*a)/360;
		System.out.println("Dairenin alani = "+alan);
		System.out.println("Dairenin cevresi = "+cevre);
		System.out.println("Daire diliminin alani = "+dilim);
	}

}
