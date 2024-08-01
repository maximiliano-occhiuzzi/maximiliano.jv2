package funciones_51;

import java.util.Scanner;

public class ejercicio51 {
	static Scanner dato = new Scanner(System.in);
	static int numero;

	public static void ingresoNumero() {
		System.out.println("ingrese un numero positivo: ");
		numero = dato.nextInt();

	}

	public static boolean trueFalse() {
		if (numero > 0) {
			System.out.println("el numero es positivo " + numero);
			return true;

		} else {
			System.out.println("el numero es negativo " + numero);

			return false;
		}
	}

	public static void main(String[] args) {
		ingresoNumero();
		trueFalse();

	}
}
