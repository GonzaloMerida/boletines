package boletin3;

public class ej7boletin3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] miArray = {1,2,3,4,5};
		
		if (contieneElemento(miArray, 1)) {
			System.out.println("si, lo contiene");
		}
			else {
				System.out.println("No, no lo contiene");
			}
		}

	
	private static boolean contieneElemento(int[] array, int elemento) {
		for (int i = 0; i < array.length; i++) {
			if (array[i]==elemento) {
				return true;
			}
		}
		return false;			
	}
}
