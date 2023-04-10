package boletin3;

import java.util.Arrays;

import java.util.Scanner;

public class ej15boletin3 {
	private static Scanner teclado = new Scanner(System.in);
	private static int numInicial = 0;
	private static int numFinal = 0;
	private static int[] primos;

	public static void main(String[] args) {

		System.out.println("introduce un número");
		int numero = Integer.parseInt(teclado.nextLine());
		primos = new int[numFinal];
		for (int i = 0; i < numFinal; i++) {
			primos[i] = i;
		}
		metodoPrimos(numFinal);

	}

	private static void metodoPrimos(int numero) {
		for (int i = 2; i < numFinal / 2; i++) {
			if (primos[i] == 0) {
				continue;
			}
			for (int j = i + 1; j < numFinal; j++) { // i*2
				if (primos[j] == 0) {
					continue;
				}
				if (primos[j] % i == 0) {
					primos[j] = 0;
				}
			}
			System.out.println(Arrays.toString(primos));
		}
	}
}
