package maximilianoo4tc;

import java.util.Scanner;

public class ejercicio42 {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		int[] numeros = new int[3];

		for (int i = 0; i < 3; i++) {
			System.out.println("ingrese 3 numeros: ");
			numeros[i] = dato.nextInt();
			int numrandom = (int) (Math.random() * 50 + 1);

			if (numeros[i] == numrandom) {
				System.out.println("ganaste");
			}

		}
		System.out.println("perdiste");

	}
}
