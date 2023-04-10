package boletinMatrices;

public class Ej16boletinmatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matriz[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 0 }, { 3, 2, 1, 4, 5 }, { 9, 5, 8, 6, 7 }, { 0, 9, 8, 5, 4 } };
				
		imprimirNuevaMatriz(matriz);
		System.out.println();
		imprimirNuevaMatriz(devuelveMatrizPares(matriz));

	}

	private static int[][] devuelveMatrizPares(int[][] matriz) {
		// variable que guarda el número de pares que tiene el elemento de la matriz
		int numPares = 0;
		// matriz del mismo tamaño que la primera
		int nuevaMatriz[][] = new int[matriz.length][matriz[0].length];
		// recorremos las filas y columnas
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				// recorremos las filas y columnas de la matriz que rodea al elemento al que le
				// miramos
				// los pares, desde i-1 y j-1 hasta i+1 y j+1 y que no se salga
				// de la matriz original, por eso el matriz.length
				for (int k = i - 1; k <= (i + 1) && k < matriz.length; k++) {
					for (int l = j - 1; l <= (j + 1) && l < matriz[i].length; l++) {
						// si estamos mirando el propio elemento del que queremos
						// ver los de alrededor, lo obviamos
						if (i == k && j == l) {
							continue;
						}
						// si el elemento está en la primera fila o columna
						// no hay fila o columna anterior, luego se obvian
						if (k < 0 || l < 0) {
							continue;
						}
						//si el número es par suma el contador de números pares
						if (matriz[k][l] % 2 == 0) {
							numPares++;
						}
						
					}
				}
				//Asigno el número de pares a la nueva matriz que se muestra
				//con el número de pares en cada elemento
				nuevaMatriz[i][j] = numPares;
				// reseteo el contador
				numPares = 0;
			}
		}
		return nuevaMatriz;
	}
	/**
	 * método para dibujar la matriz nueva
	 * @param matriz
	 */ 
	private static void imprimirNuevaMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {			
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
}
