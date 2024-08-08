package pilas;

import java.util.Scanner;
import java.util.Stack;

public class navegadorWeb {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		Stack<String> historial = new Stack<String>();
		Stack<String> forward = new Stack<String>();
		boolean flag = true;
		int opcion;
		String url = null;
		String temporal = null;
		System.out.println("BIENVENIDO/A A GOOGLE");
		System.out.println("1. desea visitar una pagina nueva?");
		System.out.println("2. volver atras");
		System.out.println("3. avanzar");
		System.out.println("4. mostrar historial");
		System.out.println("5. salir");
		opcion = dato.nextInt();

		while (opcion >= 1 && opcion < 5) {

			switch (opcion) {
			case 1:
				System.out.println("Porfavor ingrese una URL: ");
				url = dato.next().toLowerCase().toUpperCase();
				historial.push(url);
				System.out.println("historia:  " + historial.peek());
				temporal = url;
				
				break;
			case 2:
				forward.push(temporal);
					System.out.println("nueva pagina: " + forward);
				break;
			case 3:
				forward.push(url);
				System.out.println("historia:  " + historial.peek());
				break;

			case 4:
					System.out.println("historial: " + historial );
				break;

			case 5:
					System.out.println("saliendo...");
				break;
			default:
				System.out.println("Opcion no valida.");
				break;
			}
			System.out.println("1. desea visitar una pagina nueva?");
			System.out.println("2. volver atras");
			System.out.println("3. avanzar");
			System.out.println("4. mostrar historial");
			System.out.println("5. salir");
			opcion = dato.nextInt();
			historial.pop();
			if (opcion == 5) {
				System.out.println("gracias por visitarnos");

				break;
			}
		}
		System.out.println(" ");

		System.out.println("------------------------------");
		System.out.println("FIN DEL PROGRAMA");
	}
}
