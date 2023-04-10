package boletin3;

import java.util.Arrays;

public class ej17boletin3 {

	public static int numInicial = 0;
	public static int numFinal = 5;
	public static int NUM_COLUMNAS = 10;

	public static void main(String[] args) {

		int[][] matrizRaiz = { { 1, 2, 3 }, { 8, 7, 6 } };

		int[][] matrizDestino = { { 4, 5, 6 }, { 2, 3, 4 } };

		copiaMatriz(matrizRaiz, matrizDestino);

		for (int i = 0; i < matrizDestino.length; i++) {
			for (int j = 0; j < matrizDestino[0].length; j++) {
				System.out.printf("%d ", matrizDestino[i][j]);
			}
			System.out.println();
		}
		
	}

	private static void copiaMatriz(int[][] matrizRaiz, int[][] matrizDestino) {
		if (matrizRaiz.length != matrizDestino.length || matrizRaiz[0].length != matrizDestino[0].length) {
			System.out.println("Las matrices son de distinto tamaño y no se pueden copiar");
		}
		else {
			for (int i = 0; i < matrizDestino.length; i++) {
				for (int j = 0; j < matrizDestino[0].length; j++) {
					matrizDestino[i][j] = matrizRaiz[i][j];
				}
			}
		}
	}

}
