package maximilianoo4tc;
import java.util.Scanner;

public class ejercicio15 {
	public static void main(String[] args) {
		
		Scanner dato = new Scanner(System.in);
		int dinero;
		
		System.out.println("ingrese el costo maximo: ");
		dinero = dato.nextInt();
		
		if(dinero > 15000) {
			float descuento = (float) ((dinero) * 0.9);
				System.out.println("se aplico un 10% de descuento " + '$' + descuento);
		}
		else {
			System.out.println("el costo total es de es: " + '$' + dinero );
		}
	}

}
