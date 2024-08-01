package funciones_50;

import java.util.Scanner;

public class con_array50 {
	static Scanner dato = new Scanner(System.in);
	static String[] nombre = new String[3];

	public static void IngresarDatos() {
		for (int i = 0; i < nombre.length; i++) {
			System.out.println("ingrese el nombre de la primera persona: ");
			nombre[i] = dato.next();
		}
	}
	public static void mostrarDatos() {
		for (int i = 0; i < nombre.length; i++) {
			System.out.println("los nombres de las personas son: " + nombre[i]);
		}
	}

	public static void main(String[] args) {
		IngresarDatos();
		mostrarDatos();
	}
}
