package ejercicio_de_repaso;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio_sebas {
public static void main(String[] args) {
	Scanner dato = new Scanner(System.in);
	List<String> dni = new ArrayList<>();
	System.out.println("Ingrese numeros de dni (o escriba 'fin' para terminar):");
	String ingresodni = dato.nextLine();

	while (!ingresodni.equalsIgnoreCase("fin")) {
		dni.add(ingresodni);
		ingresodni = dato.nextLine();
	}
	List<String> apellidos = new ArrayList<>();
	System.out.println("Ingrese numeros de dni (o escriba 'fin' para terminar):");
	String ingresoApellido = dato.nextLine();

	while (!ingresoApellido.equalsIgnoreCase("fin")) {
		dni.add(ingresoApellido);
		ingresoApellido = dato.nextLine();
	}
	
}
}
