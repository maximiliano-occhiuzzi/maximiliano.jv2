package maximilianoo4tc;

import java.util.Scanner;

public class ejercicio40 {

	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);

		int[] temp = new int[5];
		int divis;
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("ingresar 5 temperaturas: ");
			temp[i] = dato.nextInt();
			sum += temp[i];

		}
		divis = sum / 5;
		System.out.println("el promedio de las temperaturas fue de: " + divis + " °C ");
	}
}
