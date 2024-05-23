package maximilianoo4tc;

import java.util.Scanner;

public class ejercicio34 {
	public static void main(String[] args) throws InterruptedException {
		Scanner dato = new Scanner(System.in);
		int dinero;

		for (int i = 1; i < 12; i++) {
			System.out.println("ingrese una cantidad de dinero: ");
			dinero = dato.nextInt();
			System.out.println("mes: " + i);
			if (dinero <= 100000) {
				System.out.println("hubo un mes que se ingreso un monton menor a 100000 $ ");
			}
		}
	}
}
