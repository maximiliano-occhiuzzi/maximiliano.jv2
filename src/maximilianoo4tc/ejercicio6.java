package maximilianoo4tc;
import java.util.Scanner;
import java.util.*;

public class ejercicio6 {
	
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		
		float nota;
		
			System.out.println("ingrese la nota del alumno con los decimales: ");
			 nota = dato.nextFloat();
			 
		int redondeo = (int) Math.round(nota);
			System.out.println("el promedio redondeado del alumno es: " + redondeo );
		
		
	}

}
