package prog.unidad03.repeticion;

import java.util.Scanner;

public class CalculaFactorialApp {

  public static void main(String[] args) { 
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce un numero entero mayor que cero para calcular su factorial: ");
    int numeroFactorial = Integer.parseInt(sc.nextLine());

    long resultadoFactorial = 1;
    
    if (numeroFactorial > 0) {
      
      for (int contador = 2; contador <= numeroFactorial; contador++) {
        
        
        resultadoFactorial = contador * resultadoFactorial;
        
        if ( contador == numeroFactorial) {
          
          System.out.printf("El factorial de %d vale %d", numeroFactorial, resultadoFactorial);
          
        }
            
      } 
    }else {
      
      System.out.println("Error. El numero entero no es valido. Terminando");
      
    }
    
  }
}
