package boletinMatrices;

public class ej3boletinmatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private static int mostrarMatriz(int[][] matriz) {
		
		for (int i = matriz.length -1; i >= 0; i--) {
			for (int j = matriz[i].length -1; j >= 0; j--) {
				System.out.printf("%d ", matriz[i][j]);
			}
		}
		
		//esto no lo pide el ejercicio, es un añadido
		for (int i = 0; i < matriz.length; i++) {
			for (int j= 0; j < matriz[i].length; j++) {
				System.out.printf("%3d ", matriz[matriz.length -1 -i] [matriz[i].length -1 -j]);
			}
		}
		
		return 0;
	}
	
}
