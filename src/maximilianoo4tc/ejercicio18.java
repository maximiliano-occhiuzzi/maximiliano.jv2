package maximilianoo4tc;

import java.util.Scanner;

public class ejercicio18 {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		
		char talle;
		
		System.out.println("ingrese algunos de los talles S, M ,L: ");
		talle = dato.next().toUpperCase().charAt(0);
		
		switch(talle) {
		
		case 'L' :	  
					 System.out.println("No quedan remeras over ");
		
			break;
			
		case 'M' : 	 System.out.println("quedan 3 remeras talle M ");
			
			break;
				
		case 'S' : 	 System.out.println("quedan 5 remeras talle S ");
		
			break;
		
		}
	}
}
