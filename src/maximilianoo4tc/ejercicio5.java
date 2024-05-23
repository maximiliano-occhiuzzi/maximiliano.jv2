package maximilianoo4tc;
import java.util.Scanner;
import java.util.*;

public class ejercicio5 {
	public static void main(String[] args) throws Exception {
	
		Scanner dato = new Scanner(System.in);
	
		float raiz;
		int n1;
	
	 System.out.println("ingrese un numero: ");
	 	n1= dato.nextInt();
	 	
	 	double resultado = (float) Math.sqrt(n1);
		 System.out.println("el resultado de la raiz en float es: " + resultado);
		 
		 double resultadoint = (int) Math.sqrt(n1);
		 System.out.println("el resultado de la raiz en int es: " + resultado);

	
}
}
