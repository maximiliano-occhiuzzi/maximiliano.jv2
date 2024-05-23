package maximilianoo4tc;

import java.util.Scanner;

public class ejercicio10 {
	public static void main(String[] args) {

		Scanner dato = new Scanner(System.in);

		String nombre;
		String apellido;

		System.out.println("ingrese su nombre y apellido porfavor: ");
		nombre = dato.next();
		apellido = dato.next();
		int num;

		System.out.println(nombre);
		System.out.println(apellido);

		System.out.println("ingrese un numero entre 0 y 99: ");
		num = dato.nextInt();

		int numrandom = (int) (Math.random() * 100 + 1);

		if (num == (numrandom)) {
			System.out.println("usted a ganado");
		} else {
			System.out.println(" usted perdio ");
		}

		System.out.println("su numero de bingo es: " + numrandom);

	}

}