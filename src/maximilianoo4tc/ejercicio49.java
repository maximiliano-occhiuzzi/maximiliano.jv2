package maximilianoo4tc;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio49 {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		int[] dni = new int[4];

		for (int i = 0; i < dni.length; i++) {
			System.out.println("ingrese una lista de dni: " + (i + 1));
			dni[i]= dato.nextInt();
		}
		System.out.println("elementos dni del array: " + dni.length + " ");
	
	for (int i = 0; i < dni.length; i++) {
		System.out.println("dni: " + dni[i]);
	}
	System.out.println("Antes de ordenar: " + Arrays.toString(dni));
	Arrays.sort(dni);
		System.out.println("length: " + dni.length);

	for(int ordenado : dni) {
		System.out.println("dni ordenador de forma ascendente: " + ordenado);
	}
	
}
}