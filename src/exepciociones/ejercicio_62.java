package exepciociones;

import java.util.Scanner;

public class ejercicio_62 {
	static Scanner dato = new Scanner(System.in);
	static int[] dni = new int[5];
	static boolean flag;

	public static void ingresodeDatos() {
		for (int i = 0; i < dni.length; i++) {
			flag = false;
			while (!flag) {
				try {
					System.out.println("ingrese un conjunto de numeros dni: ");
					dni[i] = dato.nextInt();
					if (dni[i] <= 0) {
						System.out.println("no podes ingresar DNIs menores o iguales a 0");
						throw new ArithmeticException();
					}
					flag = true;
				} catch (Exception e) {
					System.out.println("Error: " + e.getMessage());
					System.out.println("Valor incorrecto. Intente de nuevo.");
					dato.next(); // Clear invalid input
				}
				
			}
		}
	}

	public static void ordenamiento() {
		for (int i = 0; i < (dni.length - 1); i++) {
			// Este for es para volver a comparar todos los elementos

			for (int j = 0; j < (dni.length - i - 1); j++) {
				// Este for SOLO me manda el numero mas grande a la posicion mas alta.

				/*
				 * arreglo.length - i - 1: elimina pasadas innecesarias ya que el valor mas alto
				 * siempre quedara en la ultima posicion desde el inicio del ordenamiento.
				 */

				if (dni[j] > dni[j + 1]) {

					// Intercambiar los elementos
					int temporal = dni[j];
					// SI TENGO MAS DE UN ARRAY: String temporalNombre = nombre[j];

					/*
					 * temporal sirve para guardar por un momento al valor mas alto.
					 */

					dni[j] = dni[j + 1];
					// SI TENGO MAS DE UN ARRAY: nombre[j] = nombre[j+1]

					// La primera posicion de las dos, toma el valor de la segunda (que es mas
					// chico).
					dni[j + 1] = temporal;
					// SI TENGO MAS DE UN ARRAY: nombre[j+1] = temporalNombre ;

					// La segunda posicion, toma el valor mas alto.
				}
			}
		}

	}

	private static void mostrarArregloDesordenado() {
		// Mostrar el arreglo ordenado
		System.out.println("\nArreglo desordenado:");
		for (int num : dni) {
			System.out.print(num + " ");
		}

		for (int i = 0; i < (dni.length - 1); i++) {
			// Este for es para volver a comparar todos los elementos

			for (int j = 0; j < (dni.length - i - 1); j++) {
				// Este for SOLO me manda el numero mas grande a la posicion mas alta.

				/*
				 * arreglo.length - i - 1: elimina pasadas innecesarias ya que el valor mas alto
				 * siempre quedara en la ultima posicion desde el inicio del ordenamiento.
				 */
				if (dni[j] < dni[j + 1]) {
					// Intercambiar los elementos si están en el orden incorrecto (ascendente)
					int temp = dni[j];
					dni[j] = dni[j + 1];
					dni[j + 1] = temp;
				}
			}
		}

	}

	public static void arregloOrdenado() {
		// Mostrar el arreglo ordenado
		System.out.println("\nArreglo ordenado:");
		for (int num : dni) {
			System.out.print(num + " ");
		}

	}

	public static void main(String[] args) {
		ingresodeDatos();
		mostrarArregloDesordenado();
		arregloOrdenado();
	}
}
