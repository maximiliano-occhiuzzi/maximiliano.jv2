package maximilianoo4tc;

import java.util.Scanner;
public class ejercicio11 {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
				
		int num;
		
		System.out.println("ingrese un numero: ");
			num= dato.nextInt();
			if(num>0) {
				System.out.println("el numero es positivo ");}
			else if (num < 0) {
				System.out.println("el numero es negativo");}
			else if (num == 0) {
				System.out.println("el numero es 0");
			}
		
	}

}
