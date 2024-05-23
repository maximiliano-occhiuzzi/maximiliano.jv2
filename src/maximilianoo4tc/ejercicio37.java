package maximilianoo4tc;

import java.util.Scanner;

public class ejercicio37 {
	public static void main(String[] args) throws InterruptedException {
		Scanner dato = new Scanner(System.in);

		for (char abc = 65; abc < 91; abc++) {
			System.out.println("abecedario: " + abc);
			if (abc == 'A' || abc == 'E' || abc == 'I' || abc == 'O' || abc == 'U') {
				System.out.println("se detecto una vocal: " + abc);
			}
		}
	}
}