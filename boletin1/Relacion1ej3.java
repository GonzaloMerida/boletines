package boletin1;

import java.util.Scanner;

public class Relacion1ej3 {

	private static Scanner teclado = new
			Scanner (System.in);
	
	public static void main(String[] args) {
	
		int num;
		
		System.out.println ("Escriba un número");
		System.out.println ("Introduzca el número");
			num=Integer.parseInt(teclado.nextLine());
			
		if (num % 2 == 0) {
			System.out.println("El número seleccionado es múltiplo de 2");
		}
		
		if (num % 3 == 0) {
			System.out.println("El número seleccionado es múltiplo de 3");
		}
		if (num % 2 ==0 && num % 3 == 0) {
			System.out.println("El número es múltiplo de 2 y 3");
		}
	
	}

}
