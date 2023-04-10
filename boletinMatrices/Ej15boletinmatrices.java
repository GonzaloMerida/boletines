package boletinMatrices;

public class Ej15boletinmatrices {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matriz = {{1,2,3,4,5,6}, {7,8,9,10,11,12}, {13,14,15,16,17,18}, {19,20,21,22,23,24}, {25,26,27,28,29,30}};
		int x;
		int y;
		
	}
	
	private static int devuelvePosicion(int posicion, int fila, int columna) {
		
		int[][] matriz = {{1,2,3,4,5,6}, {7,8,9,10,11,12}, {13,14,15,16,17,18}, {19,20,21,22,23,24}, {25,26,27,28,29,30}};
		int fila=0;
		int columna =0;
		
		int posicion = (fila * matriz[0].length) + columna + 1;
		
		return posicion;
	}

}
