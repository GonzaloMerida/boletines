package boletin2;

import java.util.Scanner;

public class Ejercicio3rel2 {

	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		
		do {
			System.out.println("¿Cuántos números va a introducir?");
			num = Integer.parseInt(teclado.nextLine());
		} while (num<=0);		
		
	}

}
