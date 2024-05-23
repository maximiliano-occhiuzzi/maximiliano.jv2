package maximilianoo4tc;

import java.util.Scanner;

public class ejercicio25 {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		String respuesta;

		do {
			System.out.println("pa!, ¿puedo salir?");
			respuesta = dato.next();

		} while (respuesta.equals("NO"));
		if (respuesta.equals("SI")) {
			System.out.println("gracias papa");
		}
	}

}
