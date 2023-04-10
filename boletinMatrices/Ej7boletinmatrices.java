package boletinMatrices;

public class Ej7boletinmatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matriz1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matriz2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		if (compararMatrices(matriz1, matriz2)){
			System.out.println("Las matrices son iguales");
		}
		else {
			System.out.println("Las matrices son distintas");
		}

	}

	private static boolean compararMatrices(int[][] matriz1, int[][] matriz2) {
		boolean igual = true;

		if (matriz1.length == matriz2.length) { //compara si tienen el mismo nº de filas
			for (int i = 0; i < matriz2.length && igual; i++) {  // recorre las filas. El && igual, es para que pare de recorrer si es false
				if (matriz1[i].length == matriz2[i].length) { // compara si en cada fila hay el mismo nº de columnas
					for (int j = 0; j < matriz2[i].length && igual; j++) {  //recorre las columnas para ver los valores El && igual, es para que pare de recorrer si es false
						if (matriz1[i][j] != matriz2 [i][j]) {
							igual = false;
						}
					}
				}
				else {
					igual =false;					
				}
			}
		}
		else {
			igual = false;
		}
		return igual;
	}
	
}
