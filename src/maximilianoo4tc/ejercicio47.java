package maximilianoo4tc;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ejercicio47 {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);

		int[] notas = new int[5];

		for (int i = 0; i < notas.length; i++) {

			System.out.println("ingrese 5 calificaciones: ");
			notas[i] = dato.nextInt();

		}
		System.out.println("elementos del array: ");
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
			
		}
		Arrays.sort(notas);
		System.out.println("lenght: " + notas.length);
		for(int num : notas) {
			System.out.println("las notas ordenas de menor a mayor: " + num);
		}
	}
}
