package conjunto_De_datos_enums;

import java.util.Scanner;

public class ejercicio39 {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		meses mes;
		String ingreso;

		System.out.println("ingrese algun mes del año: ");
		ingreso = dato.nextLine().toUpperCase();

		mes = meses.valueOf(ingreso);

		switch (mes) {
		case ENERO:
		case MARZO:
		case MAYO:
		case JULIO:
		case AGOSTO:
		case OCTUBRE:
		case DICIEMBRE:
			System.out.println("el mes: " + mes.name().toLowerCase() + "tiene 31 DIAS ");
			break;

		case ABRIL:
		case JUNIO:
		case SEPTIEMBRE:
		case NOVIEMBRE:
			System.out.println("el mes: " + mes.name().toLowerCase() + " tiene 30 dias ");
			break;
		case FEBRERO:
			System.out.println("el mes: " + mes.name().toLowerCase() + " tiene 28 dias ");
			break;
		}

	}

}
