package prog.unidad03.repeticion;

import java.util.Scanner;

public class CalculaDivisoresApp {
  
  public static void main(String[] args) { 
    
    Scanner sc = new Scanner(System.in);
   
    System.out.println("Introduce un numero entero para que calcule sus divisores: ");
    int numeroIntroducido = Integer.parseInt(sc.nextLine());
    
    if (numeroIntroducido > 0) {  
    
      for (int contador = 1 ; contador <= numeroIntroducido ; contador++) {
        
        if (numeroIntroducido % contador == 0) {
          
          System.out.printf("Es divisible por %d%n", contador);        
        
        }
      }
    }else { 

    System.out.println("Introduce un numero entero mayor a 0");
  
    }
  }
}