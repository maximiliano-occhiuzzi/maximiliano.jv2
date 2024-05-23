package maximilianoo4tc;

import java.util.Scanner;

public class ejercicio36 {
	public static void main(String[] args) throws InterruptedException {
		Scanner dato = new Scanner(System.in);
		int maximo = 0;
		int minimo = 999;
		int ingreso;

		for (int i = 8; i < 17; i++) {
			System.out.println("ingrese un monto");
			ingreso = dato.nextInt();
			System.out.println("ingresos: " + " hora " + i);
			if (ingreso > maximo) {
				maximo = ingreso;
			}
			if (ingreso < minimo) {
				minimo = ingreso;
			}
		}
		System.out.println("el ingreso mas alto es: " + maximo);
		System.out.println("el ingreso  mas bajo es: " + minimo);

	
	}
}