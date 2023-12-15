package test;

public class Car {
	public String brand;
	public String color;
	public String model;
	public int speed;
	public int price;
	String arac;
	
	public void speedUp(int increment) {
		this.speed=this.speed+increment;
	}
	
	public void applyBreak(int decrement) {
		this.speed = this.speed-decrement;
	}
	public void printStates() {
		System.out.println(this.brand+" marka "+ this.model +" model "+ this.color+ " renk "  +"Arabanin hizi ; " + this.speed);
		
	}
	public static int numberOfGears=7;
	
	public void okay() {
	
		System.out.println(arac+"Kaydedildi.");
		
		}

	public String getArac() {
		return arac;
	}

	public void setArac(String arac) {
		this.arac = arac;
	}
	


}

	
