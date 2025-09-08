
import java.util.Scanner;

public class Operaciones2{

  public static void main(String args[]){
    
    int operacion = 0;
    int num_uno = 8;
    int num_dos = 4;
    int resultado = 0;
    
    Scanner scanner = new Scanner(System.in);
    System.out.println(" Elige una opcion entre 1 y 4 donde : \n 1: suma  \n 2: resta \n 3: multiplicasion \n 4: divicion");
    
    operacion = scanner.nextInt();
    
    if(operacion == 1){
      resultado = num_uno + num_dos;
      System.out.println("el resultado de la suma es: " + resultado);

      if(operacion == 2){
        resultado = num_uno - num_dos ;
        System.out.println("el resultado de la resta es: " + resultado);

        if(operacion == 3){
          resultado = num_uno * num_dos;
          System.out.println("el resultado de la multiplicasion es: " + resultado);

          if(operacion == 4){
            resultado = num_uno / num_dos;
            System.out.println("el resultado de la divicion es: " + resultado);
           }
         }
       }
      }
      else{
      System.out.println("La opcion que elegiste no existe");
    }
    scanner.close();

  }
}