package maximilianoo4tc;

import java.util.Scanner;

public class ejercicio43 {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		int[] numeros = new int[5];
		for (int i = 0; i < 5; i++) {

			System.out.println("ingrese el valor numero: " + (i + 1));
			numeros[i] = dato.nextInt();

		}
		for (int i = 0; i < 5; i++) {
			if (numeros[i] > 0) {
				System.out.println(numeros[i]);

			}
		}

	}
}