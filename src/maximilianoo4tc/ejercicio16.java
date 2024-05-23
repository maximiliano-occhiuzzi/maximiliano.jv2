package maximilianoo4tc;
import java.util.Scanner;
public class ejercicio16 {

	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
	
		float hora;
		float minuto;
		float segundo;
		
		System.out.println("ingrese una hora: ");
		hora =dato.nextFloat();
		
		System.out.println("ingrese un minuto: ");
		minuto =dato.nextFloat();
		
		System.out.println("ingrese un segundo: ");
		segundo =dato.nextFloat();
		
		if (hora > 24 ) {
			System.out.println("has superado el dia incorrecto ");
		}
		if(minuto == 60 ) {
			System.out.println("has superado la hora incorrecto " );
		}
		if(segundo > 60 ) {
			System.out.println("has superado el minuto incorrecto ");
		}
		else {
			System.out.println("son valores correctos ");
		}
		
		
		
		
	}
	
	
}
