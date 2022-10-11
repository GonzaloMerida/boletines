package boletin2;

import java.util.Scanner;

public class Ejercicio4rel2 {

	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		int i;
		int suma=0;
		
		do {
			System.out.println("Introduzca un número positivo");
			num = Integer.parseInt(teclado.nextLine());
			
			if (num<=0)
				System.out.println("No puedes introducir un número negativo");
				
		} while (num<=0);
		
		for (i=0; i<=num; i++){
			suma = suma + i;
					
		}
		System.out.printf("El resultado es %d", suma);
	}

}
