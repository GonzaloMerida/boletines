package boletin3;

import java.util.Arrays;
import java.util.Scanner;

public class ej16boletin3 {
	private static Scanner teclado = new Scanner(System.in);
	private static final int NUM_COLUMNAS = 10;

	public static void main(String[] args) {

		System.out.println("Introduce el número hasta el que");
		System.out.println("llegará tu tabla a de multiplicar: ");
		int numero = Integer.parseInt(teclado.nextLine());
		int numFinal = numero;

		teclado.close();
		
		int tablasDeMultiplicar[][] = new int[numFinal][NUM_COLUMNAS];

		for (int i = 0; i < tablasDeMultiplicar.length; i++) {
			for (int j = 0; j < NUM_COLUMNAS; j++) {
				tablasDeMultiplicar[i][j] = (i + 1) * (j + 1);
			}
		}
//		for (int i = 0; i < tablasDeMultiplicar.length; i++) {
//			System.out.println(Arrays.toString(tablasDeMultiplicar[i]));
//		}
		for (int i = 0; i < tablasDeMultiplicar.length; i++) {
			for (int k = 0; k < tablasDeMultiplicar[i].length; k++) {
				System.out.printf("%d ", tablasDeMultiplicar[i][k]);
			}
			System.out.println();
		}
	}
}
