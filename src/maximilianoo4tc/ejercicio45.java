package maximilianoo4tc;
import java.util.Scanner;

public class ejercicio45 {
	public static void main(String[] args) {
	
	Scanner dato= new Scanner(System.in);
	int[] socios = {1011, 2367, 8748, 9121, 7180, 6423, 2034};
	String[] nomsocios= {"luis","sergio","sebas","lezcano","eito","alegria","guzman"};
	
	
	for(int i= 0; i<7; i++) {
		System.out.println("para encontrar a un individuo, ingrese el numero de socio: ");
		socios[i] = dato.nextInt();
		System.out.println("el numero de socio corresponde a: "+ socios[i]);
		System.out.println(nomsocios[i]);
		}
	}
	
}
