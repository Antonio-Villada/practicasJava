import java.util.Scanner;

public class Antonio{
	
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		String nombre ="";
		int edad = 0 ;
		
		System.out.println("Ingresa tu nombre");
		nombre = in.nextLine();

		System.out.println("Ingresa tu edad");
		edad = in.nextInt();

		System.out.println("Hola " + nombre + " Confirmas tu edad de: " + edad + " ?");	
	}

}
