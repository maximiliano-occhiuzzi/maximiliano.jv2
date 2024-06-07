package Paises_Enums;

import java.util.Scanner;

import conjunto_De_datos_enums.meses;

public class ejercicio46 {
public static void main(String[] args) {
	Scanner dato = new Scanner(System.in);
	paises pais;
	String ingreso;
	
	System.out.println("ingrese un pais ");
	ingreso = dato.nextLine().toUpperCase();

	pais = paises.valueOf(ingreso);
	switch (pais) {
	case ARGENTINA:
		System.out.println("es un pais sudamericano: " + pais.name().toLowerCase() + " ");
		break;
	case BOLIVIA:
		System.out.println("es un pais sudamericano: " + pais.name().toLowerCase() + " ");
		break;
	case BRASIL:
		System.out.println("es un pais sudamericano: " + pais.name().toLowerCase() + " ");
		break;
	case CHILE:
		System.out.println("es un pais sudamericano: " + pais.name().toLowerCase() + " ");
		break;
	case COLOMBIA:
		System.out.println("es un pais sudamericano: " + pais.name().toLowerCase() + " ");
		break;
	case ECUADOR:
		System.out.println("es un pais sudamericano: " + pais.name().toLowerCase() + " ");
		break;
	case GUYANA:
		System.out.println("es un pais sudamericano: " + pais.name().toLowerCase() + " ");
		break;
	case PARAGUAY:
		System.out.println("es un pais sudamericano: " + pais.name().toLowerCase() + " ");
		break;
	case PERÚ:
		System.out.println("es un pais sudamericano: " + pais.name().toLowerCase() + " ");
		break;
	case SURINAM:
		System.out.println("es un pais sudamericano: " + pais.name().toLowerCase() + " ");
		break;
	case URUGUAY:
		System.out.println("es un pais sudamericano: " + pais.name().toLowerCase() + " ");
		break;
	case VENEZUELA:
		System.out.println("es un pais sudamericano: " + pais.name().toLowerCase() + " ");
		break;
		
	
}
}
}