package maximilianoo4tc;
import java.util.Scanner;

public class ejercicio4 {
	public static void main(String[] args) {
	
		Scanner dato = new Scanner(System.in);
		String dia_sem_a�o; 
		boolean vf;
		
	System.out.println("ingrese la semana, el mes o el a�o: ");
		dia_sem_a�o = dato.next();
			
		if(dia_sem_a�o.equals("semana") ) {
			System.out.println("la semana tiene 7 dias ");
		}
		else if(dia_sem_a�o.equals("mes") ) {
			System.out.println("el mes tiene entre 30 y 31 dias ");
			}
		else if(dia_sem_a�o.equals("a�o") ) {
			System.out.println("el a�o  tiene 365 dias ");}
		
		else {
			System.out.println("ese valor no esta disponible ");
			
		}
		
		
		
		
		
	}

}
