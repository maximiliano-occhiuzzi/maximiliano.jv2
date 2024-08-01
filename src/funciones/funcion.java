package funciones;

import java.util.Scanner;

public class funcion {
	static Scanner dato = new Scanner(System.in);
	static String apellido;

	public static void ingresarNombre() {
		// �Lleva par�metros y argumentos esta funci�n?�Por qu�? Definir par�metros y
		// argumentos.
		// no, por que dentro de los parentesis de la funcion
		// no lleva nada;
		// argumentos: argumentos que se pasan a la funcion
		// parametro: parametro: valor que se espera en la funcion

		// �Cu�l es la variable local, y cu�l la global? Mencion� dos diferencias entre
		// variables locales y globales.
		// local: dentro de la funcion pertenece y solo ocupa memoria cuando se llama la
		// funcion ;
		// globales: en toda la funcion y ocupa mas memoria;
		System.out.println("ingresar tu nombre: ");
		String nombre;
		nombre = dato.next();
		System.out.println("nombre: " + nombre);

		System.out.println("ingresar tu apellido: ");
		apellido = dato.next();

	}

	static float altura = 1.8f;

	public static float almacenarAltura(float ALTURA) {
		// Coment� el proceso, es decir: variable global -> argumento -> par�metro ->
		// funci�n -> retorno -> mostrar resultado en un syso.
		// Ahora, en el argumento de la funci�n principal, en vez de colocar �altura�,
		// coloc� 1.75f. �Qu� ocurri�?

		ALTURA = altura;
		return ALTURA;
	}

	public static int filtrarEdad(int edad) {

		if (edad > 18) {
			return edad;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		ingresarNombre();

		almacenarAltura(altura);

		System.out.println(almacenarAltura(altura));
		filtrarEdad(32);
		System.out.println(filtrarEdad(15));
	}

}
