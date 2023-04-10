package boletin3;

import java.util.Arrays;
import java.util.Random;

public class ej6boletin3 {

	public static final int NUM_INICIAL = 0;
	public static final int NUM_FINAL = 10;
	public static final int NUM_BUSCADO = 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random generador;
		generador = new Random();
		boolean encontrado = false;

		int[] numeros;
		numeros = new int[10];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = generador.nextInt(NUM_FINAL);
		}
		System.out.printf("Los números aleatorios son : %s ", Arrays.toString(numeros)); // %f decimales, %d entero, %s
																							// para cadena de texto, %b
																							// para booleano

		for (int j = 0; j < numeros.length && encontrado == false; j++) { // !encontrado es lo mismo que
																			// encontrado==false
			if (numeros[j] == NUM_BUSCADO) {
				encontrado = true;
			}
			if (encontrado == true) {
				System.out.println("El elemento a buscar es " + encontrado);
			} else {
				System.out.println("El elemento a buscar no se ha encontrado");
			}
		}
	}
}
