package boletin3;

import java.util.Arrays;

public class ej14boletin3 {
	public static final int NUM_MAXIMO = 10;
	public static int[] cola = new int[NUM_MAXIMO];
	public static int numElementos = 0;
	public static int posPrimerElemento = 0;

	public static void main(String[] args) {

		for (int i = 0; i < 11; i++) {
			encolarNumeros(i);
		}

		for (int i = 0; i < 11; i++) {
			desencolarNumeros();
		}

	}

	private static void encolarNumeros(int numero) {
		if (numElementos < NUM_MAXIMO) {
			cola[(posPrimerElemento + numElementos++) % NUM_MAXIMO] = numero;
		} else {
			System.out.println("La cola está llena");
		}
		imprimirArray();

	}

	private static void desencolarNumeros() {
		if (numElementos > 0) {
			cola[posPrimerElemento] = 0;
			posPrimerElemento = (posPrimerElemento + 1) % NUM_MAXIMO;
			numElementos--;
		} else {
			System.out.println("la cola está vacía");
		}
		imprimirArray();
	}

	private static void imprimirArray() {
		System.out.println(Arrays.toString(cola));
	}
}