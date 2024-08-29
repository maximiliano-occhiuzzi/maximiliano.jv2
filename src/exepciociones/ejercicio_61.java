package exepciociones;

import java.util.Scanner;

public class ejercicio_61 {
	static Scanner dato = new Scanner(System.in);
	static int[] numeros = new int[3];
	static int numrandom;
	static boolean flag;

	public static void ingresoNumeros() {
	    numrandom = (int) (Math.random() * 50 + 1);
        boolean validInput;
 
        for (int i = 0; i < 3; i++) {
            validInput = false;
            while (!validInput) {
                try {
                    System.out.println("Ingrese número " + (i + 1) + " (debe ser mayor que 0): ");
                    numeros[i] = dato.nextInt();
                    
                    // Validate if the number is positive
                    if (numeros[i] <= 0) {
                        throw new ArithmeticException("Número no debe ser menor o igual a cero.");
                    }
                    
                    validInput = true; // Input is valid
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                    System.out.println("Valor incorrecto. Intente de nuevo.");
                    dato.next(); // Clear invalid input
                }
            }
        }
        
        // Check if any input number matches the random number
        boolean won = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numrandom) {
                won = true;
                break; // No need to check further
            }
        }
        
        if (won) {
            System.out.println("¡Ganaste! El número aleatorio era: " + numrandom);
        } else {
            System.out.println("Perdiste. El número aleatorio era: " + numrandom);
        }
    }
	

	public static void main(String[] args) {
		ingresoNumeros();
	}
}
