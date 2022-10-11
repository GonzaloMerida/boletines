package boletin1;

import java.util.Scanner;

public class Ejercicio8rel1 {

	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int hora1;
		int min1;
		int seg1;
		int hora2;
		int min2;
		int seg2;
		
		System.out.println ("Introduzca hora");
			hora1=Integer.parseInt(teclado.nextLine());
		System.out.println ("Introduzca minuto");
			min1=Integer.parseInt(teclado.nextLine());
		System.out.println ("Introduzca segundo");
			seg1=Integer.parseInt(teclado.nextLine());
		System.out.println ("Introduzca hora");
			hora2=Integer.parseInt(teclado.nextLine());
		System.out.println ("Introduzca minuto");
			min2=Integer.parseInt(teclado.nextLine());
		System.out.println ("Introduzca segundo");
			seg2=Integer.parseInt(teclado.nextLine());
			
		if (hora1 == hora2) {
			if (min1 == min2) {
				if (seg1 == seg2) {
					System.out.println ("las horas son iguales");
				}
				else if (seg1 > seg2) {
					System.out.println ("la hora 1 es mayor");
				}
				else {
					System.out.println ("La hora 2 es mayor");
				}
			}
			else if (min1 > min2) {
				System.out.println ("La hora 1 es mayor");
			}
			else {
				System.out.println ("La hora 2 es mayor");
			}
		}
		else if (hora1 > hora2) {
			System.out.println ("La hora 1 es mayor");
		}
		else {
			System.out.println ("La hora 2 es mayor");
		}
		}
}
		
		