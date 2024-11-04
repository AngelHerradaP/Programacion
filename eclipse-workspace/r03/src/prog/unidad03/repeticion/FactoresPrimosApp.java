package prog.unidad03.repeticion;

import java.util.Scanner;

public class FactoresPrimosApp {

  public static void main(String[] args) { 
    
    Scanner sc = new Scanner(System.in);
   
    int numeroComprobacionPrimo = 0;
    
    System.out.println("Introduce un numero entero entero mayor que 1 para descomponerlo en factores primos: ");
    int numeroIntroducido = Integer.parseInt(sc.nextLine());
    
    if (numeroIntroducido > 1) {  
    
      for (int contador1 = 2 ; contador1 <= numeroIntroducido ; contador1++) {
        
        for (int contador2 = 1; contador2 <= contador1 ; contador2++) {

          if (contador1 % contador2 == 0) {

            numeroComprobacionPrimo++;

          }
        }

        if (numeroComprobacionPrimo == 2) {


          if (numeroIntroducido % contador1 == 0) {
              
            System.out.printf("%d es un factor primo%n", contador1); 
            numeroIntroducido = numeroIntroducido / contador1;
            
          }
        }
        
        numeroComprobacionPrimo = 0;
        
      }
        
    }else { 

    System.out.println("Introduce un numero entero mayor a 1");
  
    }
  }
}