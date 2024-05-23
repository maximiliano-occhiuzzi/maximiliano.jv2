package maximilianoo4tc;

import java.util.Scanner;

public class ejercicio20 {
	public static void main(String[] args) throws InterruptedException {
		Scanner dato = new Scanner(System.in);
		int i = 1;

		while (i <= 100) {
			System.out.println(i);
			i++;
			Thread.sleep(2 * 1000);

		}
	}
}