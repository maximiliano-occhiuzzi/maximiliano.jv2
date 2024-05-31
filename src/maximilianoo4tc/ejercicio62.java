package maximilianoo4tc;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio62 {
private static final int[] apellidos = null;

public static void main(String[] args) {
	Scanner dato = new Scanner(System.in);
	
	String [] apellidos = new String[5];
	for (int i = 0; i < apellidos.length; i++) {
		
		System.out.println("ingrese 5 apellidos: ");
		apellidos[i] = dato.next();
	
	}
	for (int i = 0; i < apellidos.length; i++) {
		System.out.println("apellidos: " + apellidos[i]);
	}
		Arrays.sort(apellidos);
		System.out.println("lenght: " + apellidos.length);
		for(String ordenAlfabeto : apellidos) {
			System.out.println("apellidos ordenados alfabeticamente: " + ordenAlfabeto);
		}
	
	
	
	
}
}
