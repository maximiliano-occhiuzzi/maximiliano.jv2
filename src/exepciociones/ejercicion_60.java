package exepciociones;

import java.util.Scanner;

public class ejercicion_60 {
	static Scanner dato = new Scanner(System.in);
	static float costoT, descuento;

	public static float ingresoCosto() {
		try {
			System.out.println("ingreso el costo");
			costoT = dato.nextInt();
			if (costoT <= 0) {
				throw new ArithmeticException();
			}

		}

		catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			System.out.println("valor incorrecto");
		}
		return costoT;
	}

	public static float Descuento(float costo) {

		if (costo > 15000) {
			descuento = (costoT) * 0.10f;
			System.out.println("se aplico un 10% de descuento " + '$' + descuento);
			float valorT = costoT - descuento;
			System.out.println("El monto total es: " + valorT);
			return costo;

		} else {
			System.out.println("el costo total es:");
			System.out.println(costo);
			return costo;
		}

	}

	public static void main(String[] args) {
		Descuento(ingresoCosto());

	}

}
