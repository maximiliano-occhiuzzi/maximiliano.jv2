package maximilianoo4tc;

import java.util.Scanner;

public class ejercicio21 {
	public static void main(String[] args) throws InterruptedException {

		Scanner dato = new Scanner(System.in);
		int i = 0;

		while (i <= 100) {
			System.out.println(i);
			Thread.sleep(20);

			if (i == 35) {
				System.out.println("temperatura inicial");
				Thread.sleep(2000);
			}
			if (i == 85) {
				System.out.println("temperatura PELIGROSA");
				Thread.sleep(2000);
			}
			if (i == 100) {
				System.out.println("BOOM EXPLOTO TODA LA COMPU!!");
				Thread.sleep(2000);
			}

			i += 1;
		}
	}
}