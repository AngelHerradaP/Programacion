package prog.unidad03.repeticion;

import java.util.Scanner;

public class NumerosCrecientesApp {
  
  public static void main(String[] args) { 
    
    Scanner sc = new Scanner(System.in);

    System.out.println("¿Introduce un numero entero: ");
    int numeroIntroducido = Integer.parseInt(sc.nextLine());
    
    int numeroIntroducido1 = numeroIntroducido;
    int numeroIntroducido2 = numeroIntroducido;
    
    do {
      
      System.out.printf("Introduce ahora un numero mayor que %d (Introduce un numero menor o  igual para terminar): ", numeroIntroducido1);
      numeroIntroducido = Integer.parseInt(sc.nextLine());
      
      if (numeroIntroducido1 < numeroIntroducido) {
        
        numeroIntroducido1 = numeroIntroducido;
        numeroIntroducido2 = numeroIntroducido + 1;
        
      }else{
        
        numeroIntroducido2 = numeroIntroducido;
        
        System.out.printf("El numero %d no es mayor que el numero anterior %d. Terminando ", numeroIntroducido, numeroIntroducido1);
        
      }
      
    } while (numeroIntroducido2 > numeroIntroducido );
  }
}
