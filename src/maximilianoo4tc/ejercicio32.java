package maximilianoo4tc;

import java.util.Scanner;

public class ejercicio32 {

	public static void main(String[] args) throws InterruptedException {
		Scanner dato = new Scanner(System.in);
		int n;
		System.out.println("ingrese un numero para multiplicar: ");
		n = dato.nextInt();
		for (int i = 1; i <= 20; i++) {
			System.out.println(i + "*" + n + "es igual a: " + i * n);

			if (i == 20) {
				System.out.println("tu tabla es esta");
			}
			System.out.println();
		}
	}
}
