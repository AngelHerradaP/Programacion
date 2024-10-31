package prog.unidad03.repeticion;
import java.util.Scanner;

public class NumerosParesImparesEntreApp {

  public static void main(String[] args) { 
    
    Scanner sc = new Scanner(System.in);
    
      System.out.println("Introduce el numero de comienzo del intervalo: ");
      int numeroComienzoIntervalo = Integer.parseInt(sc.nextLine());
      System.out.println("Introduce el numero de fin de intervalo: ");
      int numeroFinalIntervalo = Integer.parseInt(sc.nextLine());
      
      if (numeroComienzoIntervalo <= numeroFinalIntervalo) {
        
        for (int contador = numeroComienzoIntervalo; contador <= numeroFinalIntervalo; contador++) {
          
          if (contador % 2 == 0) {
            
            System.out.printf("El numero %d es par%n", contador);
            
          }else {
            
            System.out.printf("El numero %d es impar%n", contador);
            
          }
          
        } 
        
      }else {
        
        System.out.println("El valor introducido no es correcto. Terminando el programa.");
        
    }  
  }
}