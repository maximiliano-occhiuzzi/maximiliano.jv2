package listas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class ejercicio44 {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);

		List<String> jugadores = new ArrayList<>();

		System.out.println("Ingrese elementos a la lista (escriba 'fin' para terminar):");
		String entrada = dato.nextLine();

		while (!entrada.equalsIgnoreCase("fin")) {
			jugadores.add(entrada);
			entrada = dato.nextLine();
		}

		// Imprimimos la lista
		System.out.println("Lista creada por el usuario:");
		for (String elemento : jugadores) {
			System.out.println(elemento);
		}
		System.out.println("Cantidad de elementos: " + jugadores.size());

		HashSet<String> set = new HashSet<>(jugadores);

		// Paso 3: Limpiar la lista original
		jugadores.clear();

		// Paso 4: Añadir todos los elementos del HashSet de vuelta a la lista, ya que
		// HashSet NO permite elementos duplicados.
		jugadores.addAll(set);

		// Paso 5: Imprimir la lista sin duplicados
		System.out.println("Lista sin duplicados: " + jugadores);

		// Cerramos el scanner
		dato.close();

	}
}
