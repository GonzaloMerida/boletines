package boletin3;

public class ej4boletin3 {

	public static final int NUM_INICIAL = 0;
	public static final int NUM_FINAL = 100;
	public static final int CANT_NUM = 20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables
		int[] numeros;
		numeros = new int[CANT_NUM];
		int[] terminaciones;
		terminaciones = new int [10];
		
		
		int suma = 0;
		
		//Código
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)(Math.random() * (NUM_FINAL - NUM_INICIAL + 1) + NUM_INICIAL); // AL MULTIPLCAR POR RANDOM, DEFINE LA ANCHURA. Math.random da siempre un número entre 0 y 1
		}
		for (int j: numeros) {
			suma = suma + j;
			terminaciones [j%10]++;
		}
		double media = (double) suma / CANT_NUM;
			System.out.println("La media de los números es " + media);
		
		for (int k = 0; k < terminaciones.length; k++) {
			System.out.printf("Números que terminan en %d : %d. Esto equivale a un: %.2f \n", k, terminaciones[k], ((double) terminaciones[k]/CANT_NUM)*100);
		
		}

	}
}