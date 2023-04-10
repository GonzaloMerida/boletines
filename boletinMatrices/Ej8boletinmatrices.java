package boletinMatrices;

public class Ej8boletinmatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matriz1 = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] matriz2 = { { 3, 4, 5 }, { 1, 6, 7 } };
		
		if (sumaMatrices(matriz1, matriz2) != null) {
			//escribir la matriz suma con lo típico de 2 for y un syso que la vaya pintando
		}
		else {
			System.out.println("las matrices son distintas");
		}

	}

	private static int[][] sumaMatrices(int[][] matriz1, int[][] matriz2) {
		boolean igual = true;
		int[][] suma;

		if (matriz1.length == matriz2.length) {
			for (int i = 0; i < matriz1.length && igual; i++) {
				if (matriz1[i].length != matriz2[i].length) {
					igual = false;
				}
			}
		}
		if (igual) {
			suma = new int[matriz1.length][]; // reservo la memoria para el array (un array es una dirección de
														// memoria
			for (int i = 0; i < matriz1.length; i++) {
				suma[i] = new int[matriz1[i].length]; // cada fila de la matriz suma es un nuevo array de longitud
														// matriz1[i].length
				for (int j = 0; j < matriz1[i].length; j++) {
					suma[i][j] = matriz1[i][j] + matriz2[i][j];
				}
			}
			return suma;
		}
		else {
			return null;
		}
	}
}
