package funciones_50;

import java.util.Scanner;

public class ejercicio50 {
	static Scanner dato = new Scanner(System.in);
	static String nombre;

	public static void Ingresar() {
		System.out.println("ingrese el nombre de la primera persona: ");
		nombre = dato.next();
	}

	public static void mostrarDatos() {
		System.out.println("el nombre de la persona es: " + nombre);

	}

	public static void main(String[] args) {
		Ingresar();
		mostrarDatos();
		Ingresar();
		mostrarDatos();
		Ingresar();
		mostrarDatos();
	}
}
