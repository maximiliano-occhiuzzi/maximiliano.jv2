package funciones_54;

import java.util.Scanner;

public class ejercicio54 {
	static Scanner dato = new Scanner(System.in);
	static int[] numeros = new int[3];
	static int numrandom;

	public static void ingresoNumeros() {
		for (int i = 0; i < 3; i++) {
			System.out.println("ingrese 3 numeros: ");
			System.out.println(numrandom);
			numeros[i] = dato.nextInt();

			numrandom = (int) (Math.random() * 50 + 1);

		}
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == numrandom) {
				System.out.println("ganaste");
			} else {
				System.out.println("perdiste, proba la proxima");
			}
		}
	}

	public static void main(String[] args) {
		ingresoNumeros();
	}
}
