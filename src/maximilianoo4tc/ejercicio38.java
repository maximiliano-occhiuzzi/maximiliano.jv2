package maximilianoo4tc;

import java.util.Scanner;

public class ejercicio38 {
	public static void main(String[] args) throws InterruptedException {
		Scanner dato = new Scanner(System.in);

		int hora;
		int maximo = 0;
		int minimo = 9999;
		int clientes = 0;
		for (int i = 9; i < 19; i += 2) {

			System.out.println("numero de clientes, registrada en la hora: " + i);
			clientes = dato.nextInt();
			System.out.println(clientes + " clientes ");
			if (clientes > maximo) {
				maximo = clientes;
			}
			if (clientes < minimo) {
				minimo = clientes;
			}
		}
		System.out.println("la cantidad mas alta de clientes fue de: " + maximo);
		System.out.println("la cantidad mas baja de clientes fue de: " + minimo);
	}
}