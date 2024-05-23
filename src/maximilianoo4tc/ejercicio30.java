package maximilianoo4tc;

import java.util.Scanner;

public class ejercicio30 {

	public static void main(String[] args) throws InterruptedException {
		Scanner dato = new Scanner(System.in);

		for (int bat = 0; bat <= 100; bat++) {
			System.out.println(bat + "seguidores");
			Thread.sleep(20);
			if (bat == 100) {
				System.out.println("llegamos a 100 seguidores");
			}
		
		}

	}
	
}
