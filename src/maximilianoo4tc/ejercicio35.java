package maximilianoo4tc;

import java.util.Scanner;

public class ejercicio35 {
	public static void main(String[] args) throws InterruptedException {
		Scanner dato = new Scanner(System.in);

		int nota;
		int maximo = 0;
		int minimo = 9999;
		float sum = 0;
		float prom;

		for (int i = 1; i < 5; i++) {
			System.out.println("ingrese 5 calificaciones: ");
			nota = dato.nextInt();
			if (nota > maximo) {
				maximo = nota;
			}
			if (nota < minimo) {
				minimo = nota;
			}

			System.out.println("calificacion: " + i);
			sum = sum + nota;
		}
		System.out.println("la nota mas alta es: " + maximo);
		System.out.println("la nota mas baja es: " + minimo);

		prom = sum / 5;
		System.out.println("el promedio del alumno es de: " + prom);
	}
}
