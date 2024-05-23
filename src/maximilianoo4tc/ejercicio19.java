package maximilianoo4tc;
import java.util.Scanner;
public class ejercicio19 {

	public static void main(String[] args) {
		Scanner dato = new Scanner (System.in);
		
		int num;
		System.out.println("que cafe vas a querer ordenar capo tenes 5 opciones: ");
		num = dato.nextInt();
		if(num >= 1 && num <=5 ) {
			System.out.println("si te tomo la orden ");
		}
		else {
			System.out.println("no capo, no existe otra funcion, andate");
		}
		switch(num) {
		
		case 1:		System.out.println("Perfecto preparando CAFE CORTADO ");
		
			break;
			
		case 2:		System.out.println("Perfecto preparando CAFE LATTE ");
		
		break;
		
		case 3:		System.out.println("Perfecto preparando CAFE SOLO ");
		
		break;
		
		case 4:		System.out.println("Perfecto preparando CAFE LAGRIMA ");
		
		break;
		
		case 5:		System.out.println("Perfecto saliendo del programa ");
		
		break;
		
		}
	}
}
