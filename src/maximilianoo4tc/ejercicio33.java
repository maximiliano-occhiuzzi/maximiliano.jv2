package maximilianoo4tc;

import java.util.Scanner;

public class ejercicio33 {

	public static void main(String[] args) throws InterruptedException {
		Scanner dato = new Scanner(System.in);
		String nom;
		int edad;
		String jugadores[] = new String[11] ;
		
		for (int i = 1; i <= 11 ; i++) {
			System.out.println("ingrese el nombre del jugador: ");
			nom = dato.next();
			System.out.println("ingrese la edad del jugador");
			edad = dato.nextInt();
			
			System.out.println("jugador numero :" + i);
			
		}
			}

}
//nose puede imprimir los datos de un for//* 