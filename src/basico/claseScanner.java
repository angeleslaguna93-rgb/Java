package basico;

import java.util.Scanner;

public class claseScanner {
	
	public static void main (String [] argas) {
	
	// la clasa scanner debe instanciarse
	
	Scanner tecl = new Scanner (System.in);
	
	// Ahora se crean las variables a partir del metodo scanner 
	
	System.out.println("Hola cual es tu nombre:");
	String nombre = tecl.nextLine();
	
	System.out.println("Cual es tu edad:  ");
	int edad =tecl.nextInt() ;
	
	System.out.println("\nGracias," + nombre +" me dijiste que tienes" + edad  );
	
	System.out.println("Escribe un numero cualquiera: ");
	int numero = tecl.nextInt();
	
	System.out.println("Escribe el nombre de un compañer(a);  ");
	String compa = tecl.nextLine();
	
	System.out.println("El numero" + numero + "sera para una rifa");
    System.out.println("y lo jugaran con " + compa);
	
	
	
     }
}
