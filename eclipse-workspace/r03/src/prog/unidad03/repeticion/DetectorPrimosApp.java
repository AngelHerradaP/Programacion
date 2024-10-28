package prog.unidad03.repeticion;

import java.util.Scanner;

public class DetectorPrimosApp {
  
  public static void main(String[] args) { 

    Scanner sc = new Scanner(System.in);

    int numeroComprobacionPrimo = 0;

    System.out.println("Introduce un numero entero mayor que 1 para ver si es primo o no: ");
    int numeroIntroducido = Integer.parseInt(sc.nextLine());

    if (numeroIntroducido > 1) {  

      for (int contador = 1 ; contador <= numeroIntroducido ; contador++) {

        if (numeroIntroducido % contador == 0) {

          numeroComprobacionPrimo++;

        }
      }

      if (numeroComprobacionPrimo == 2) {

        System.out.printf("El numero %d Es primo%n", numeroIntroducido);

      }else {

        System.out.printf("El numero %d No es primo%n", numeroIntroducido);

      }
    }else { 
      
    System.out.println("Introduce un numero entero mayor a 0");
 
    }
  }
}
