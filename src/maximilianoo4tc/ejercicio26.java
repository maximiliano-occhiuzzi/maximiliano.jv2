package maximilianoo4tc;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class ejercicio26 {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		int contraseña;
		int intentos = 3;

		do {
			System.out.println("ingrese la contraseña: ");
			contraseña = dato.nextInt();
			if (contraseña == 2008) {
				System.out.println("contraseña correcta");
			}
			if(contraseña != 2008) {
			System.out.println("contraseña incorrecta");
			System.out.println("intentos: " + intentos);
			intentos -= 1;}
			if(intentos == 0) {
				System.out.println("tu programa termina ahi");}
		} while (contraseña != 2008 && intentos > 0);
		
		
	
}
}