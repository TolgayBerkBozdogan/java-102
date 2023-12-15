package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugun hava cok guzel. ";
		String yeniMesaj = cities();
		System.out.println(yeniMesaj);
		int toplam = total(13,3);
		System.out.println(toplam);
		int toplam2 =total2(1,2,3,4,5,6,7,8,9);
		System.out.println(toplam2);
		

	}
	
	public static void add() {
		System.out.println("Eklendi");
	}


	public static void delete() {
		System.out.println("Silindi");
	}
	
	public static void update() {
		System.out.println("Guncellendi");
		
	}
	public static int total(int n1, int n2) {
		int result = n1+n2;
		
		return result;
	}
	
	public static int total2(int... numbers) {
		int toplam = 0;
		for(int n:numbers) {
			toplam+=n;
		}
		return toplam;
	}
	
	public static String cities() {
		return "Ankara";
	}

}
