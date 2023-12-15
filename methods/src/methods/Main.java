package methods;


public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
	}
	
	public static void sayiBulmaca(){
		int[] numbers = new int[] {1,2,3,4,5,6,7,8,9};
		int looking= 5;
		boolean isThere = false;
	
		for(int i = 0; i<numbers.length; i++) {
			if(numbers[i]==looking) {
				isThere=true;
			}
		}
		if(isThere) {
			givingMessage("Sayi Mevcuttur : "+looking );
		}else {
			givingMessage("Sayi Mevcut Degildir : " +looking);
		}
		
		
		
	}
	
	
	public static void givingMessage(String message) {
			System.out.println(message);

	}

}
