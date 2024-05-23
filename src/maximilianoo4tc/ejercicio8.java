package maximilianoo4tc;

import java.util.Scanner;
import java.util.*;
import java.util.Random;

public class ejercicio8 {
	public static void main(String[] args) {

		Scanner dato = new Scanner(System.in);
		float num;

		System.out.println("ingrese un numero entero y 2 decimales: ");
		num = dato.nextFloat();

		int elevado = ((int) Math.pow(num, 2));
		double random =  Math.random();
		int suma = (int) (elevado + random);
		int multirandom = (int) (suma * 7);
		float raiz = (float) Math.sqrt(multirandom);
		
		System.out.println("el resultado de la raiz es: " + raiz );

	}
}
