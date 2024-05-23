package maximilianoo4tc;

import java.util.Scanner;

public class ejercicio3 {
	public static void main(String[] args) {
	Scanner dato = new Scanner(System.in);
	float n1;
	float n2;
	System.out.println("ingrese un numero: ");
	n1=dato.nextFloat();

	System.out.println("ingrese otro numero: ");
	n2=dato.nextFloat();
			
	float suma = n1 + n2;
	float resta = n1 - n2;
	float dividir = n1 / n2;
	float multi = n1 * n2;
	
	System.out.println("el resultado de la suma de n1 + n2 en float es: " + suma);
	System.out.println("la resta de n1 + n2 en float es: " + resta);
	System.out.println("la division de n1 + n2 en float es: " + dividir);
	System.out.println("la multiplicacion de n1 + n2 en float es: " + multi);
	
	int sumaint = (int) suma;
	int restaint = (int) resta;
	int dividirint = (int) dividir;
	int multiint = (int) multi;

	
	System.out.println("el resultado de la suma de n1 + n2 en int es: " + sumaint);
	System.out.println("la resta de n1 + n2 en int es: " + restaint);
	System.out.println("la division de n1 + n2 en int es: " + dividirint);
	System.out.println("la multiplicacion de n1 + n2 en int es: " + multiint);
	

		

	}
}
