package funciones_53;

import java.util.Scanner;

public class ejercicio53 {
	static Scanner dato = new Scanner(System.in);
	static int notas;
	static int max = -999;
	static int min = 999;
	static int sum;

	public static int IngresoCalificaciones() {
		for (int i = 0; i < 5; i++) {
			System.out.println("ingrese 5 calificaciones: ");

			notas = dato.nextInt();
			break;
		}
		return notas;

	}

	public static int MaxMin(int nota) {
		for (int i = 0; i < 5; i++) {
			if (nota > max) {
				max = nota;
			}
			if (nota < min) {
				min = nota;
			}
		}

		return nota;
	}

	public static int resultadoMaxMin(int nota) {
		System.out.println("la nota mas alta fue: " + min);
		System.out.println("la nota mas alta fue: " + max);
		sum = sum + notas;
		return nota;
	}

	public static void promedio(float promedio) {
		float prom = sum / 5;
		System.out.println("el promedio del alumno es de: " + prom);

	}

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			resultadoMaxMin(MaxMin((IngresoCalificaciones())));
		}

		promedio(resultadoMaxMin(MaxMin((IngresoCalificaciones()))));
	}
}
