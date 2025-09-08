import java.util.Scanner;

public class Operaciones3 {
	
	public static void main(String args[]){

		Scanner in = new Scanner(System.in);
		int numUno = 0, numDos = 0, operador=0, resultado = 0;
				
		System.out.println("Ingresa la operacion que desea realizar : \n "
					+ "1 : Suma \n 2 : Resta \n 3 : Multiplicacion \n 4 : Divicion ");
		operador = in.nextInt();

		System.out.println("Ingresa el primer numero :");
		numUno = in.nextInt();

		System.out.println("Ingresa el segundo numero");
		numDos = in.nextInt();


		switch (operador) {

		case 1 : resultado = numUno + numDos;
		 	System.out.println("El resultado de la suma es : " + resultado);
			break;

		case 2 : resultado = numUno - numDos ;
			System.out.println("El resultado de la resta es : "  + resultado);
			break;
			
		case 3 : resultado = numUno * numDos ;
			System.out.println(" El resultado de la multiplicacion es : " + resultado);
			break;
			
		case 4 : resultado = numUno / numDos;
			System.out.println(" El resultado de la divicion es : " + resultado);
			break;
		default : System.out.println(" Error!!, El operador no exite");			


		}
	} 
}


