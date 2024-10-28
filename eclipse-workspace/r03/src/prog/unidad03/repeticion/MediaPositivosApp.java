package prog.unidad03.repeticion;

import java.util.Scanner;

public class MediaPositivosApp {

  public static void main(String[] args) { 
    
    Scanner sc = new Scanner(System.in);
 
    double numero = 0;
    double sumaMedia = numero;
    
    for ( int numeroDeCiclos = 0; numero >= 0  ; numeroDeCiclos++) {
     
      System.out.println("Introduce un numero real positivo o cero (negativo para terminar): ");
      numero = Integer.parseInt(sc.nextLine());
      
      if (numero < 0) {
        
        System.out.printf("La media de los %d numeros introducidos vale %f", numeroDeCiclos, sumaMedia / numeroDeCiclos);

      }else {
        
        sumaMedia = numero + sumaMedia;
        
      }
    }        
  }
}
