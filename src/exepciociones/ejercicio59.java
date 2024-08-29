package exepciociones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ejercicio59 {
	static int edad;
	static Scanner dato = new Scanner(System.in);

	public static int ingresoDeDatos() {
		try {
			System.out.println("ingrese su edad: ");
			edad = dato.nextInt();
			if(edad == 0 ) {
				System.out.println("no podes tener edad 0");
				
				throw new ArithmeticException();
			}
			System.out.println("la edad es: " + edad);
		
		}
			
			
			catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
				System.out.println("valor incorrecto");

			} finally { // Finally actua SIEMPRE. No es obligatorio.
				System.out.println("Saliendo de TRY CATCH.");
			}

			System.out.println("Programa finalizado.");
			return edad;
		
	}

	
	public static void main(String[] args) {
		ingresoDeDatos();
	}
}
