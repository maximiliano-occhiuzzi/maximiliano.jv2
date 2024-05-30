package maximilianoo4tc;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio48 {
	public static void main(String[] args) {

		Scanner dato = new Scanner(System.in);

		String[] apellido = new String[4];

		for (int i = 0; i < apellido.length; i++) {
			System.out.println("ingrese 4 apellidos: " + (i + 1));
			apellido[i] = dato.next();
		}
		System.out.println("elementos del array: ");

		for (int i = 0; i < apellido.length; i++) {
			System.out.print(apellido[i] + " ");
		}
		Arrays.sort(apellido);
		System.out.println("lenght: " + apellido.length);
		for (String orden : apellido) {
			System.out.println("los apellidos ordenados en orden alfabetico " + orden);
		}

	}
}
