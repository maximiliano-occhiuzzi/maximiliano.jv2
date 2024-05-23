package maximilianoo4tc;

import java.util.Scanner;

public class ejercicio23 {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);

		String nombre;
		String apellido;
		boolean bandera = false;
		System.out.println("ingrese su nombre y apellido porfavor: ");
		nombre = dato.next();
		apellido = dato.next();
		int num;
		int intentos = 1;
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
			intentos += 1;

			if (intentos == 0)
				;

		} while (num != numrandom && intentos < 5);
		System.out.println("se terminaron tus intentos, el numero ganador era: " + numrandom);
		bandera = true;
	}
}