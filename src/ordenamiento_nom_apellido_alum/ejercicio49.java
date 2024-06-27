package ordenamiento_nom_apellido_alum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio49 {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		List<String> Apellidos = new ArrayList<>();
		System.out.println("Ingrese el apellido del alumno (o escriba 'fin' para terminar):");
		String ingresoapellido = dato.nextLine();

		while (!ingresoapellido.equalsIgnoreCase("fin")) {
			Apellidos.add(ingresoapellido);
			ingresoapellido = dato.nextLine();
		}
		List<String> nombres = new ArrayList<>();
		System.out.println("ingrese el nombre del alumno:");
		String ingresoNombre = dato.nextLine();
		while (!ingresoNombre.equalsIgnoreCase("fin")) {

			nombres.add(ingresoNombre);
			ingresoNombre = dato.nextLine();

		}

		List<String> calificaciones = new ArrayList<>();
		System.out.println("ingrese las calificaciones del alumno:");
		String ingresoCalificacion = dato.nextLine();
		while (!ingresoCalificacion.equalsIgnoreCase("fin")) {

			calificaciones.add(ingresoCalificacion);
			ingresoCalificacion = dato.nextLine();

		}
		for (int i = 0; i < Apellidos.size() - 1; i++) {
			for (int j = 0; j < Apellidos.size() - i - 1; j++) {
				if (Apellidos.get(j).compareTo(Apellidos.get(j + 1)) > 0) {

					String temp = Apellidos.get(j);
					Apellidos.set(j, Apellidos.get(j + 1));
					Apellidos.set(j + 1, temp);

					String tempcalif = calificaciones.get(j);
					calificaciones.set(j, calificaciones.get(j + 1));
					calificaciones.set(j + 1, tempcalif);

				}
				

			}
		}
	    System.out.println("Lista ordenada por apellidos:");
        for (int k = 0; k < Apellidos.size(); k++) {
            System.out.println(Apellidos.get(k) + ", " + nombres.get(k) + ", " + calificaciones.get(k));
        }
	}
}
