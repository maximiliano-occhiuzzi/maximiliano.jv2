package listas_paises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ejercicio45 {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);

		List<String> paises = new ArrayList<>();
		// por programa
		paises.add("Argentina");
		paises.add("Brasil");
		paises.add("Bolivia");
		paises.add("Chile");
		paises.add("Colombia");
		paises.add("Ecuador");
		paises.add("Guyana");
		paises.add("Paraguay");
		paises.add("Perú");
		paises.add("Surinam");
		paises.add("Uruguay");
		paises.add("Venezuela");

		for (String pais : paises) {
			System.out.println("");
			String ingreso = dato.next();

			if (pais.equalsIgnoreCase(ingreso)) {
				System.out.println(ingreso + " es un pais sudamericano");
				// con strings, no puedo colocar como condicion pais == ingreso

			} else {
				System.err.println("ese pais no existe en sudamerica");
			}

		}

		Collections.sort(paises);

		for (String elemento : paises) {
			System.out.println(elemento);
		}

	}
}
