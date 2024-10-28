package prog.unidad03.repeticion;

import java.util.Scanner;

public class CuentaPositivosApp {

  public static void main(String[] args) { 
    
    Scanner sc = new Scanner(System.in);

    int numeroEntero = 0;
    int contadorPositivos = 0;
    
    do {
    
      System.out.println("Introduce un numero entero positivo o cero (negativo para terminar): ");
      numeroEntero = Integer.parseInt(sc.nextLine());
      
      if (numeroEntero >= 0) {
            
        System.out.printf("El numero %d es positivo%n", numeroEntero);
        contadorPositivos++;
        
      }
    
    } while (numeroEntero >= 0);
      
      System.out.printf("Has introducido %d numeros positivos", contadorPositivos);  
    
  }
  
}
