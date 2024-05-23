package maximilianoo4tc;

import java.util.Scanner;

public class ejercicio27 {
	public static void main(String[] args) throws InterruptedException {
		Scanner dato = new Scanner(System.in);
		int bateria = 100;

		do {
			if (bateria < 100 && bateria > 0) {
				System.out.println("esta en uso el celu");
			}
			if (bateria == 20) {
				System.out.println("bateria baja");
				Thread.sleep(1000);
			}

			bateria--;
			Thread.sleep(20);
			System.out.println(bateria + "%");

		} while (bateria > 0);
		if (bateria == 0) {
			System.out.println("bateria agotada");
			Thread.sleep(1000);
		}
	}
}