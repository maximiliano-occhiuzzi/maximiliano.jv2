package maximilianoo4tc;

import java.util.Scanner;

public class ejercicio29 {
	public static void main(String[] args) throws InterruptedException {
		Scanner dato = new Scanner(System.in);

		for (int bat = 100; bat >= 0; bat--) {
			System.out.println(bat + "%");
			Thread.sleep(20);
			if (bat == 20) {
				System.out.println("bateria baja pa");
			}
			if (bat == 0) {
				System.out.println("bateria agotada pa");
			}
		}

	}
}
