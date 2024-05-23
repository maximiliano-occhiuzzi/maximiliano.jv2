package maximilianoo4tc;

import java.util.Scanner;

public class ejercicio22 {
	public static void main(String[] args) {

		Scanner dato = new Scanner(System.in);

		String nombre;
		String apellido;

		System.out.println("ingrese su nombre y apellido porfavor: ");
		nombre = dato.next();
		apellido = dato.next();
		int num;
		int intentos = 10;
		System.out.println(nombre);
		System.out.println(apellido);

		System.out.println("ingrese un numero entre 0 y 99: ");
		num = dato.nextInt();

		int numrandom = (int) (Math.random() * 100 + 1);
		if (num == numrandom) {
			System.out.println("ganaste");
		}
		do {

			System.out.println("ingrese un numero entre 0 y 99: ");
			num = dato.nextInt();
			intentos -= 1;

			if (intentos == 0) {
				System.out.println("se terminaron tus intentos");
			}

		} while (num != numrandom && intentos > 0);

	}
}