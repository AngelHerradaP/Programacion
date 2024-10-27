package prog.unidad03.repeticion;
import java.util.Scanner;

public class NumerosParesImparesEntreExtraApp {
  public static void main(String[] args) { 
    
    Scanner sc = new Scanner(System.in);
    
    int numeroComienzoIntervalo = 0;
    int numeroFinalIntervalo = 1;
    
    do {
    
      System.out.println("Introduce el numero de comienzo del intervalo: ");
      numeroComienzoIntervalo = Integer.parseInt(sc.nextLine());
      System.out.println("Introduce el numero de fin de intervalo: ");
      numeroFinalIntervalo = Integer.parseInt(sc.nextLine());
      
      if (numeroComienzoIntervalo <= numeroFinalIntervalo) {
        
        for (int contador = numeroComienzoIntervalo; contador <= numeroFinalIntervalo; contador++) {
          
          if (contador % 2 == 0) {
            
            System.out.printf("El numero %d es par%n", contador);
            
          }else {
            
            System.out.printf("El numero %d es impar%n", contador);
            
          }
          
        } 
        
      }else {
        
        System.out.println("El valor introducido no es correcto. Intentalo de nuevo.");
        
      }
    
    } while (numeroComienzoIntervalo > numeroFinalIntervalo);
      
  }
}