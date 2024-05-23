package maximilianoo4tc;
import java.util.Scanner;
import java.util.Random;

public class ejercicio9 {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		
	String nombre;
	String apellido;
	
	System.out.println("ingrese su nombre y apellido porfavor: ");
	nombre = dato.next();
	apellido = dato.next();
	
	System.out.println(nombre);
	System.out.println(apellido);
	
	int numrandom = (int)( Math.random()*100+1);
	
	System.out.println("su numero de bingo es: " + numrandom);
	
	


	
		
		
		
		
		
	}
}
