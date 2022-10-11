package boletin1;

import java.util.Scanner;

public class Ejercicio9rel1 {

	private static Scanner teclado = new Scanner(System.in);
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			float precio;
			char prod;
			
			System.out.println("Introduce un precio");
				precio = Integer.parseInt(teclado.nextLine());
			
			System.out.println("Introduce tipo de producto (A, B, C,): ");
				prod = teclado.nextLine().charAt(0);
				
			if (prod == 'A') {
				System.out.println("7%");
			}
			else if ((prod == 'C') || (precio < 500)){
				System.out.println ("12%");
			}
			else
				System.out.println ("9%");
		}
					
	}
				