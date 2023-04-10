package boletin3;

import java.util.Arrays;

public class ej12boletin3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 5, 3, 7, 8, 1, 2 };
		
		System.out.println(Arrays.toString(arrayOrdenado(array)));
		

	}

	private static int[] arrayOrdenado(int[] ordena) {

		for (int i = 0; i < ordena.length - 1; i++) {
			for (int f = 0; f < ordena.length - 1 - i; f++) {
				if (ordena[f + 1] < ordena[f]) {
					int numMenor = ordena[f + 1]; //numMenor guarda e número más pequeño
					ordena[f + 1] = ordena[f];
					ordena[f] = numMenor;

				}
			}
		}
		return ordena;
	}
}
