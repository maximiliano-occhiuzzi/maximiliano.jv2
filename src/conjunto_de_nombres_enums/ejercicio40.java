package conjunto_de_nombres_enums;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio40 {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);

		String[] nombre = new String[9];

		for (int i = 0; i < nombre.length; i++) {
			System.out.println("ingrese 9 nombres: ");
			nombre[i] = dato.next();
		}
		System.out.println("elementos del array: " + nombre.length + " ");
		for (int i = 0; i < nombre.length; i++) {
			System.out.println("nombres: " + nombre[i]);
		}
		Arrays.sort(nombre);

		for (String muestra : nombre) {
			System.out.println("los nombres ordenados alfabeticamente ingresados son: " + muestra);
		}
	}
}