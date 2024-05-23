package maximilianoo4tc;
import java.util.Scanner;

public class ejercicio12 {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
	float nota;	
	
	System.out.println("ingrese un numero entre 1 y 10: ");
		nota = dato.nextFloat();
		
		if(nota < 1 || nota > 10) {
			System.out.println("ingresaste un valor incorrecto");
		}
		if(nota >= 1 && nota <=3 ) {
			System.out.println("insuficiente");
		}
		else if(nota > 3 && nota < 6) {
			System.out.println("no logrado ");
		}
		else if(nota == 6 || nota == 7) {
			System.out.println("suficiente ");
			}
		else if(nota == 8 || nota == 9) {
			System.out.println("notable ");
		}
		else if(nota == 10) {
			System.out.println("sobresaliente ");
		}
		
		
	}
	
	
	
}
