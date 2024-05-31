package maximilianoo4tc;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio50 {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		int[] dineroApostadores = new int[5];
		int maxMonto = 0;
		int minMonto = 0;
		for (int i = 0; i < dineroApostadores.length; i++) {
			System.out.println("¿cuanto dinero desea apostar? ");
			dineroApostadores[i] = dato.nextInt();

			if (dineroApostadores[i] < 500) {
				System.out.println("la apuesta es menor a 500 pa " + dineroApostadores[i]);
				continue;
			}

			if (i == 0) {
				maxMonto = dineroApostadores[0];
				minMonto = dineroApostadores[0];
			}

			if (dineroApostadores[i] > maxMonto) {
				maxMonto = dineroApostadores[i];
			}
			if (dineroApostadores[i] < minMonto) {
				minMonto = dineroApostadores[i];
			}

		}
		for (int i = 0; i < dineroApostadores.length; i++) {
			System.out.println("monto numero: " + (i + 1) + " : " + dineroApostadores[i]);
		}

		System.out.println("la apuesta maxima fue de: " + maxMonto + " $ ");
		System.out.println("la apuesta maxima fue de: " + minMonto + " $ ");
		// *////////

		Arrays.sort(dineroApostadores);
		System.out.println("length: " + dineroApostadores.length);

		for (int ordenado : dineroApostadores) {
			System.out.println("el monto ordenado de forma ascendente: " + ordenado);

		}

	}
}
