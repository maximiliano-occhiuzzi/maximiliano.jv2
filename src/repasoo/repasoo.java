package repasoo;

import java.util.Scanner;

public class repasoo {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		lista<String>dni=new arraylist<>();
		lista<Interger>apellidos=new arraylist<>();
		
		System.out.println("¿cuantas personas desea registrar?");
		int personas = datos.nextInt();		
		
		for (int i = 0; i < personas; i++) {
			System.out.println("ingrese el dni: ");
			dni.add(datos.nextInt());
			
			System.out.println("Ingrese apellido: ");
			apellidos.add(datos.nextInt());
			
		}
		 for (int i = 0; i < personas-1; i++) {
			 for (int j = 0; j < personas-i-1; j++) {
					 
				 if(dni.get(j)> dni.get(j+1)) {
					 int temporal =dni.get(j);
					 
					 dni.set(j,dni.get(j+1));
					 
					 dni.set(j,+1,temporal);
					 
                     String tempapellido;
					 
					 apellidos.set(j,apellidos.get(j+1));
					 
					 apellidos.set(j,+1,temporal);
				 }
				 
				 System.out.println("-----------------------------------------");  
				 System.out.println("\t Lista ordenada");
				 for (int i = 0;i < dni.size(); i++) {
					System.out.println("el dni" + (i+1)+"es"+ dni.get(i)+ "perteneciente a: "+apellidos.get(i));
				}
				 
			 } 
		}
		
		
	}

}
