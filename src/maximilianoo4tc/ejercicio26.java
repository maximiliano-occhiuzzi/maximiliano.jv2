package maximilianoo4tc;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class ejercicio26 {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		int contrase�a;
		int intentos = 3;

		do {
			System.out.println("ingrese la contrase�a: ");
			contrase�a = dato.nextInt();
			if (contrase�a == 2008) {
				System.out.println("contrase�a correcta");
			}
			if(contrase�a != 2008) {
			System.out.println("contrase�a incorrecta");
			System.out.println("intentos: " + intentos);
			intentos -= 1;}
			if(intentos == 0) {
				System.out.println("tu programa termina ahi");}
		} while (contrase�a != 2008 && intentos > 0);
		
		
	
}
}