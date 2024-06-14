package Ordenamiento_De_burbujas;

import java.util.Scanner;

public class ejercicio48 {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		int[] dni = new int[5];

		for (int i = 0; i < dni.length; i++) {
			System.out.println("ingrese un conjunto de numeros dni: ");
			dni[i] = dato.nextInt();
		}
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

		// Mostrar el arreglo ordenado
		System.out.println("\nArreglo ordenado:");
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

				if (dni[j] > dni[j + 1]) {

					// Intercambiar los elementos
					int temporal = dni[j];
					// SI TENGO MAS DE UN ARRAY: String temporalNombre = nombre[j];

					/*
					 * temporal sirve para guardar por un momento al valor mas alto.
					 */

					dni[j] = temporal;
					// SI TENGO MAS DE UN ARRAY: nombre[j] = nombre[j+1]

					// La primera posicion de las dos, toma el valor de la segunda (que es mas
					// chico).
					dni[j + 1] =  dni[j + 1];
					// SI TENGO MAS DE UN ARRAY: nombre[j+1] = temporalNombre ;

					// La segunda posicion, toma el valor mas alto.
				}
			}
		}

		// Mostrar el arreglo ordenado
		System.out.println("\nArreglo desordenado:");
		for (int num : dni) {
			System.out.print(num + " ");
		}
	
		
		
	}

}
