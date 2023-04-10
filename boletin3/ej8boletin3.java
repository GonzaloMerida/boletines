package boletin3;

public class ej8boletin3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] miArray = { 1, 2, 3, 4, 5 };
		int posicion = encuentraPosicion(miArray, 1);

		if (posicion == -1) {
			System.out.println("El elemento no se encuentra en el array");
		} else {
			System.out.printf("El elemento se encuentra en la posición %d", posicion);
		}

	}

	private static int encuentraPosicion(int[] array, int i) {// int porque devuelve una posición
		int pos = -1;
		for (int j = 0; j < array.length; j++) {
			if (array[j] == i) {
				pos = j;
			}

		}
		return pos;
	}
}
