package boletin1;

import java.util.Scanner;

public class Ejercicio10rel1 {

	private static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		int num2;
		char simbolo;
		
		System.out.println("introduce un número");
			num1=Integer.parseInt(teclado.nextLine());
		System.out.println("introduce un número");
			num2=Integer.parseInt(teclado.nextLine());
		System.out.println("introduce un carácter");
			simbolo=teclado.nextLine().charAt(0);
	}

}
