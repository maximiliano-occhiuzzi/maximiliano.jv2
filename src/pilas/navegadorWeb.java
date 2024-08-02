package pilas;

import java.util.Scanner;
import java.util.Stack;

public class navegadorWeb {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		Stack<Integer> historial = new Stack<Integer>();
		Stack<Integer> skip = new Stack<Integer>();
		int opcion = 0;
		boolean flag= false;
			
			while(opcion > 5 && opcion< 1 ){
				System.out.println("BIENVENIDO/A A GOOGLE");
				System.out.println("1. desea visitar una pagina nueva?");
				System.out.println("2. volver atras");
				System.out.println("3. avanzar");
				System.out.println("4. mostrar historial");
				System.out.println("5. salir");
				opcion = dato.nextInt();
				
					
			}
		
		
	}
}
