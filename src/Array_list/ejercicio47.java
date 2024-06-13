package Array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ejercicio47 {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		List<String> socios = new ArrayList<>();

		socios.add("alegria");
		socios.add("eito");
		socios.add("guzman");
		socios.add("lezcano");
		socios.add("luis");
		socios.add("sebas");
		socios.add("sergio");

		List<Integer> numSocios = new ArrayList<>();

		numSocios.add(1011);
		numSocios.add(2367);
		numSocios.add(8748);
		numSocios.add(9121);
		numSocios.add(7180);
		numSocios.add(6423);
		numSocios.add(2034);

		// METODO REMOVE:ELIMINAR ELEMENTOS DE UNA LISTA -> nombreDeLaLista.remove()
		// METODO SET: asignar un valor a un determinado indice de la lista.

		System.out.println("desea modificar o eliminar algun elemento");
		System.out.println("1. borrar 2. modificar ");
		int opcion = dato.nextInt();
		if (opcion == 1) {

			System.out.println("ingrese el numero de socio a borrar: ");
			System.out.println(numSocios);
			int numSocioborrar = dato.nextInt();
			int posicionLista = numSocios.indexOf(numSocioborrar);
			numSocios.remove(posicionLista);
			socios.remove(posicionLista);
			System.out.println("lista nueva: " + numSocios);
			System.out.println("lista nueva: " + socios);

		} else if (opcion == 2) {

			System.out.println("ingrese el numero de socio a modificar: ");
			System.out.println(numSocios);

			int numSociomodificar = dato.nextInt();
			int posicionLista = numSocios.indexOf(numSociomodificar);

			System.out.println("ingrese el nuevo numero de socio: ");
			int nuevoNumSocio = dato.nextInt();

			System.out.println("ingrese el nuevo nombre del socio: ");
			String nuevoNombre = dato.next();

			numSocios.set(posicionLista, nuevoNumSocio);
			socios.set(posicionLista, nuevoNombre);
			System.out.println("lista nueva: " + numSocios);
			System.out.println("socios: " + socios);

		}
		boolean encontrado = false;

		System.out.println("Ingrese el numero de socio a buscar");
		int nombreBuscado = dato.nextInt();

		for (int i = 0; i < numSocios.size(); i++) {
			if (numSocios.get(i) == (nombreBuscado)) {
				System.out.println("El nombre esta en lista");
				encontrado = true;
				System.out.println("numero del socio buscado: " + nombreBuscado + " nombre: " + socios.get(i));
				break;
			}

		}
		if (encontrado == false) {
			System.out.println("No se encontro el nombre.");
		}

		// System.out.println("numero del socio buscado: " + numSocio);

	}
}