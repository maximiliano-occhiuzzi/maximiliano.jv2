package maximilianoo4tc;

import java.util.Scanner;

public class ejercicio39 {

	public static void main(String[] args) throws InterruptedException {
		Scanner dato = new Scanner(System.in);
		String[] nombre = new String[11];
		int[] edad = new int[11];
		Object List;

		for (int i = 0; i < 11; i++) {
			System.out.println("ingrese el nombre del jugador: ");
			nombre[i] = dato.next();
			System.out.println("ingrese la edad del jugador");
			edad[i] = dato.nextInt();

		}
		for (int i = 0; i < 11; i++) {

			System.out.println("Nombre en la posicion " + i + ": ");
			System.out.println(nombre[i]);

			System.out.println("Edad en la posicion " + i + ": ");
			System.out.println(edad[i]);

			System.out.println("\n "); // meto \n para ser mas prolijo.

		}
	}

}
