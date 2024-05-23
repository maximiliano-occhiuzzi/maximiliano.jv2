package maximilianoo4tc;
import java.util.Scanner;

public class ejercicio13 {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
	
		char talle;
		
		System.out.println("ingrese algunos de los talles S, M ,L: ");
			talle = dato.next().toUpperCase().charAt(0);
			
			if(talle == 'S'){
				System.out.println("quedan 5 remeras ");
			}
			else if(talle == 'M') {
				System.out.println("quedan 3 remeras ");
			}
			else if(talle == 'L') {
				System.out.println("no quedan remeras over ");
			}
			

	}
}