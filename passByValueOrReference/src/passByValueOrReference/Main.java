package passByValueOrReference;

public class Main {

	public static void main(String[] args) {
		int number =5;// static variable
		System.out.println("pervious value of number: "+ number);
		changeTheValue(number);
		System.out.println("current value of number: "+number);
		PassByReference reference = new PassByReference();
		reference.number2=7;
		System.out.println("pervious value of number2: "+reference.number2);
		reference.change(reference);
		System.out.println("current value of number2: "+reference.number2);
		int [] array = new int [] {2,3,6};
		System.out.println("First element of array : "+ array[0]);
	
		ArrayAsAReference arrayAsAReference = new ArrayAsAReference();
		arrayAsAReference.cahngeTheArray(array);
		System.out.println("current element of array : "+ array[0]);

	}
	public static void changeTheValue(int number) {
		number = number+5;
	}

}
