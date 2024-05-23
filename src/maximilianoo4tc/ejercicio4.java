package maximilianoo4tc;
import java.util.Scanner;

public class ejercicio4 {
	public static void main(String[] args) {
	
		Scanner dato = new Scanner(System.in);
		String dia_sem_año; 
		boolean vf;
		
	System.out.println("ingrese la semana, el mes o el año: ");
		dia_sem_año = dato.next();
			
		if(dia_sem_año.equals("semana") ) {
			System.out.println("la semana tiene 7 dias ");
		}
		else if(dia_sem_año.equals("mes") ) {
			System.out.println("el mes tiene entre 30 y 31 dias ");
			}
		else if(dia_sem_año.equals("año") ) {
			System.out.println("el año  tiene 365 dias ");}
		
		else {
			System.out.println("ese valor no esta disponible ");
			
		}
		
		
		
		
		
	}

}
