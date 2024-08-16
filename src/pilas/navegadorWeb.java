package pilas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class navegadorWeb {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		List<String> historial = new ArrayList<>();
		Stack<String> adelante = new Stack<>();
		Stack<String> atras = new Stack<>();
		int opcion;
		String url = null;

		System.out.println("BIENVENIDO/A A GOOGLE");

		do {
			System.out.println("1. ¿Desea visitar una página nueva?");
			System.out.println("2. Volver atrás");
			System.out.println("3. Avanzar");
			System.out.println("4. Mostrar historial");
			System.out.println("5. Salir");
			opcion = dato.nextInt();
			dato.nextLine(); // Consumir el salto de línea pendiente

			switch (opcion) {
			case 1:
				System.out.println("Por favor ingrese una URL: ");
				url = dato.nextLine();
				historial.add(url);
				adelante.clear(); // Limpiar el historial de avance al visitar una nueva página
				atras.push(url);
				System.out.println("Nueva página: " + url);
				break;
			case 2:
				if (!atras.isEmpty()) {
					adelante.push(atras.pop());
					if (!atras.isEmpty()) {
						url = atras.peek();
						System.out.println("Página actual: " + url);
					} else {
						System.out.println("No hay páginas a las que volver.");
					}
				} else {
					System.out.println("No hay páginas en el historial.");
				}
				break;
			case 3:
				if (!adelante.isEmpty()) {
					url = adelante.pop();
					atras.push(url);
					System.out.println("Página actual: " + url);
				} else {
					System.out.println("No hay páginas para avanzar.");
				}
				break;
			case 4:
				System.out.println("Historial de páginas visitadas:");
				for (String pagina : historial) {
					System.out.println(pagina);
				}
				break;
			case 5:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opción no válida.");
				break;
			}
		} while (opcion != 5);

		System.out.println(" ");
		System.out.println("------------------------------");
		System.out.println("FIN DEL PROGRAMA");
	}
}
/*
 * El manejo del historial y la navegación hacia atrás y hacia adelante:
 * 
 * No estás manejando el historial correctamente al navegar hacia atrás (case 2)
 * y hacia adelante (case 3). El historial debe permitirte retroceder y avanzar
 * a través de las URLs visitadas. El uso de next().toLowerCase().toUpperCase():
 * 
 * La cadena resultante es siempre en mayúsculas porque toUpperCase() se aplica
 * después de toLowerCase(), lo que hace que toLowerCase() sea innecesario.
 * Limpieza de historial en cada iteración:
 * 
 * Estás limpiando el historial (historial.clear()) en cada iteración del bucle,
 * lo cual no es lo que se desea. Deberías limpiar el historial solo cuando el
 * usuario elige salir. Manejo de URLs de avance y retroceso:
 * 
 * El forward stack se usa para las URLs que el usuario puede visitar después de
 * retroceder, pero no hay un manejo claro para las URLs que se retroceden.
 */
