package boletin3;

import java.util.Arrays;

public class ej10boletin3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 3, 1, 3, 3, 0, 5, 6, 6, 7 };

		System.out.println(Arrays.toString(eliminaDuplicados(array))); // {1,2,3,4,5,6,7}

	}

	private static int[] eliminaDuplicados(int[] numeros) {

		int[] nuevoArray = new int[numeros.length];
		int elementosArray = 0;

		for (int elemento : numeros) { // es lo mismo que (int i = 0, i<numeros.length, i++) int e = numeros[i]

			if (!contieneElemento(nuevoArray, elemento)) {
				nuevoArray[elementosArray++] = elemento;
			}
		}
		if (contieneElemento(numeros, 0)) {
			elementosArray = elementosArray + 1; // lo mismo sería poner elementosArray++ o elementosArray+1
		}

		return recortaArray (nuevoArray, elementosArray);
	}

	private static boolean contieneElemento(int[] array, int elemento) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == elemento) {
				return true;
			}
		}
		return false;
	}

	private static int[] recortaArray(int[] array, int longitud) { // teniendo en cuenta que longitud es menor que
																	// array.length

		int[] recortadoArray = new int[longitud];

		for (int i = 0; i < longitud; i++) {

			recortadoArray[i] = array[i];
		}
		return recortadoArray;
	}
}
