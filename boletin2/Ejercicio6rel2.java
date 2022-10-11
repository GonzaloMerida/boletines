package boletin2;

import java.util.Scanner;

public class Ejercicio6rel2 {

	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numa;
		int numb;
		int acumulador=0;
		int cambio;
		int i;
		
			
		System.out.println("Introduzca dos números");
		numa = Integer.parseInt(teclado.nextLine());
		numb = Integer.parseInt(teclado.nextLine());
		
		
		numb = Math.abs(numb);// esto hace el valor absoluto
		
		if (numa>numb) { // para que haya menos repeticiones en el for
			cambio=numa;
			numa=numb;
			numb=cambio;
		}
		for (i=numa; i>0; i--) {
			acumulador = acumulador + numb;
		}
		System.out.printf("El resultado es %d", acumulador);
		
		teclado.close();		
	}

}
