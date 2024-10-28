package prog.unidad03.repeticion;

import java.util.Scanner;

public class PositivoNegativoApp {
  
  public static void main(String[] args) { 
    
    Scanner sc = new Scanner(System.in);

    int numeroEntero = 0;
    
    do {
    
      System.out.println("Introduce un numero entero (0 para terminar): ");
      numeroEntero = Integer.parseInt(sc.nextLine());
      
      if (numeroEntero > 0) {
            
        System.out.printf("El numero %d es positivo%n", numeroEntero);
            
      }else if (numeroEntero < 0) {
            
        System.out.printf("El numero %d es negativo%n", numeroEntero); 
        
      }
    
    } while (numeroEntero != 0);
      
  }
}
