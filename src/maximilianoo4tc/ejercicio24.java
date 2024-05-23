package maximilianoo4tc;

import java.util.Scanner;

public class ejercicio24 {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);

		int n1;
		int n2;
		boolean bandera = false;

		do {
			System.out.println("ingrese un numero: ");
			n1 = dato.nextInt();
			
			System.out.println("ingrese un numero: ");
			n2 = dato.nextInt();
			
			int suma = n1 + n2;
			System.out.println("el resultado de la suma es: " + suma);
			
		} while (n1 != 0 && n2 != 0);
		if (n1 == 0 || n2 == 0) {
			System.out.println("tu programa termina ahi pa ");
		}
	}
}
