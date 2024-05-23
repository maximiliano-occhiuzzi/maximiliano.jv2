package maximilianoo4tc;

import java.util.Scanner;

public class ejercicio17 {
	public static void main(String[] args) {

		Scanner dato = new Scanner(System.in);

		int num1;
		int num2;
		int num3;

		System.out.println("INGRESE 3 NUMEROS: ");
		num1 = dato.nextInt();

		System.out.println("INGRESE 3 NUMEROS: ");
		num2 = dato.nextInt();

		System.out.println("INGRESE 3 NUMEROS: ");
		num3 = dato.nextInt();

		/* NUMERO DE PRIMER VALOR */

		if (num1 > num2 && num1 > num3 && num2 > num3) {
			System.out.println("el numero mas grande es: " + num1);
			System.out.println("el numero intermedio es el: " + num2);
			System.out.println("el mas chicho es el numero: " + num3);

		} else if (num1 > num2 && num1 > num3 && num3 > num2) {
			System.out.println("el numero mas grande es: " + num1);
			System.out.println("el numero intermedio es el: " + num3);
			System.out.println("el mas chicho es el numero: " + num2);

		}

		else if (num2 > num1 && num2 > num3 && num1 > num3) {
			System.out.println("el numero mas grande es: " + num2);
			System.out.println("el numero intermedio es el: " + num1);
			System.out.println("el mas chicho es el numero: " + num3);
		} else if (num2 > num1 && num2 > num3 && num3 > num1) {
			System.out.println("el numero mas grande es: " + num2);
			System.out.println("el numero intermedio es el: " + num3);
			System.out.println("el mas chicho es el numero: " + num1);
		}

		else if (num3 > num2 && num3 > num1 && num2 > num1) {
			System.out.println("el numero mas grande es: " + num3);
			System.out.println("el numero intermedio es el: " + num2);
			System.out.println("el mas chicho es el numero: " + num1);
		} else if (num3 > num2 && num3 > num1 && num1 > num2) {
			System.out.println("el numero mas grande es: " + num3);
			System.out.println("el numero intermedio es el: " + num1);
			System.out.println("el mas chicho es el numero: " + num2);
		}

	}

}
