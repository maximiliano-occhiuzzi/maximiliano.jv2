package jugadores_de_futbol_array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ejercicio41 {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);

		String[] jugadores = new String[11];
		int[] edades = new int[11];

		for (int i = 0; i < jugadores.length; i++) {
			System.out.println("ingrese 11 jugadores de futbol: ");
			jugadores[i] = dato.next();
		}
		for (int i = 0; i < jugadores.length; i++) {
			System.out.println("jugadores de futbol: " + " " + jugadores.length + " ");
		}
		Arrays.sort(jugadores);
		for (String listaJugadores : jugadores) {
			System.out.println("los jugadores de futbol: " + listaJugadores);
		}

		for (int i = 0; i < edades.length; i++) {
			System.out.println("ingrese 11 edades de los jugadores: ");
			edades[i] = dato.nextInt();
		}
		for (int i = 0; i < edades.length; i++) {
			System.out.println("las edades de jugadores de los futbol: " + edades[i] + " " + edades.length + " ");
		}
		Arrays.sort(edades);

		for (int listaEdades : edades) {
			System.out.println("los jugadores de futbol: " + listaEdades + " ");
		}

	}
}
