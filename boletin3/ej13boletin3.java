package boletin3;

import java.util.Arrays;

public class ej13boletin3 {
	public static final int NUM_MAXIMO = 10;
	public static int[] pila = new int[NUM_MAXIMO];
	public static int numElementos = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 11; i++) {
			apilarNumeros (i);
		}
		
		for (int i = 0; i < 11; i++) {
			desapilarNumeros ();
		}
		apilarNumeros(17);
	}
	
	private static void apilarNumeros (int numeros) {
		if (numElementos < NUM_MAXIMO) {
			pila[numElementos++] = numeros;
		}
		else {
			System.out.println("la pila está llena");
		}
		imprimirArray();
	}
	
	private static void desapilarNumeros() {
		if (numElementos > 0) {
			pila[--numElementos] = 0;
		}
		else {
			System.out.println("la pila está vacía");
		}
		imprimirArray();
	}
	
	private static void imprimirArray() {
		System.out.println(Arrays.toString(pila));
	}
}
