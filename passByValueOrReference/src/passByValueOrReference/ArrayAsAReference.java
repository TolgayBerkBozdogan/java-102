package passByValueOrReference;

public class ArrayAsAReference {
	public void cahngeTheArray(int [] array) {
		array=new int [] {7,8,9};
		array[0]=array[0]+7;
	}

}
