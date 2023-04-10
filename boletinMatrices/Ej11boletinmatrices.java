package boletinMatrices;

public class Ej11boletinmatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] mat1 = {{5,8,9,0}, {4,7,5,2}, {1,7,3,2}};
		int[][] mat2 = {{2,3,7,1}, {2,5,7,4}, {0,9,8,5}};

		if (compInversa(mat1, mat2)) {
			System.out.println("Son inversas");
		} else {
			System.out.println("No son inversas");
		}

	}

	private static boolean compInversa(int[][] mat1, int[][] mat2) {

		boolean inversas = true;

		if (mat1.length == mat2.length) {
			if (mat1[0].length == mat2[0].length) {
				for (int i = 0; i < mat1.length && inversas; i++) {
					for (int j = 0; j < mat1[i].length && inversas; j++) {
						if (mat1[i][j] != mat2[mat1.length - 1 - i][mat1[i].length - 1 - j]) {
							inversas = false;
						}
					}
				}
			}
		}
		else {
			inversas=false;
		}
		return inversas;
	}

}
