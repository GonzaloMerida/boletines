package boletin2;

import java.util.Scanner;

public class Ejercicio5rel2 {

	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		int contador = 0;
		do {
			System.out.println("Introduzca un número positivo");
			num = Integer.parseInt(teclado.nextLine());
			contador++; //esto es lo mismo que contador = contador +1
				
		} while (num>=0);

		System.out.println("Has introducido " + (contador-1) + " números positivos"); //donde pone (contador-1) podría poner un predecremento con --contador
		teclado.close();
	}

}
