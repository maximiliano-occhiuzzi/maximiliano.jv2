package funciones_52;

import java.util.Scanner;

public class ejercicio52 {
	static Scanner dato = new Scanner(System.in);
	static float costoT, descuento;

	public static float ingresoCosto() {
		System.out.println("ingreso el costo");
		costoT = dato.nextInt();
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
