package boletinMatrices;

import java.util.Arrays;

public class ej1boletinmatrices {

	public static void main(String[] args) {
		int[][] matriz = { { 2, 4, 5, 6 }, { 1, 2, 3, 4 } };

		if (comprobarNegativos(matriz)) {
			System.out.println("Hay números negativos");
		} else {
			System.out.println("No hay números negativos");
		}

	}
	

	/**
	 * comprueba si en la matriz pasada hay algún número negativo
	 * @param matriz 
	 * @return devuelve true si hay negativo, false si no
	 */
	private static boolean comprobarNegativos(int[][] matriz) {

		boolean comprobarNegativo = false;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 0) {
					comprobarNegativo = true;
					break;
				}

			}
		}

		return comprobarNegativo;
	}
}