package boletinMatrices;

public class Ej13boletinmatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matriz = {{1,2,3,4,5}, {6,7,8,9,0}, {3,2,1,4,5}, {9,5,8,6,7}, {0,9,8,5,4}};
		
		int[][] diagonal = matDiagonal(matriz);
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(diagonal[i][j] + " ");
			}
			System.out.println();
		}

	}
	/**
	 * método que comprueba si la matriz es cuadrada y realiza su reflejo diagonal
	 * @param matriz
	 * @return la matriz reflejo en diagonal
	 */
	private static int[][] matDiagonal(int[][] matriz){
		
		int[][] diagonal = new int[matriz.length][matriz[0].length];
		
		if (matriz.length == matriz[0].length) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					diagonal[i][j] = matriz[matriz.length -1 -j][matriz[i].length -1 -i];
				}
			}
		}
		return diagonal;
	}

}

