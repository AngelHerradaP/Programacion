package prog.unidad03.repeticion;

import java.util.Scanner;

public class SumaParesIntervaloApp {

  public static void main(String[] args) { 
    
    Scanner sc = new Scanner(System.in);
    
    for (int comprobacionCiclo = 1; comprobacionCiclo == 1;) {
      
      System.out.println("Introduce el numero de comienzo del intervalo: ");
      int comienzoIntervalo = Integer.parseInt(sc.nextLine());
      System.out.println("Introduce el numero de fin del intervalo: ");
      int finIntervalo = Integer.parseInt(sc.nextLine());
      
      if (comienzoIntervalo <= finIntervalo) {

        int comienzoIntervaloMas = comienzoIntervalo;
        int comienzoIntervaloMas2 = comienzoIntervalo;
        
        while (comienzoIntervaloMas < finIntervalo - 1) {
          
          if (comienzoIntervaloMas % 2 == 0) {

            comienzoIntervaloMas += 2;
            comienzoIntervaloMas2 = comienzoIntervaloMas2 + comienzoIntervaloMas;
            
          }else {
            
            comienzoIntervaloMas++;
            comienzoIntervaloMas2++;
            
          }
        }
        
        System.out.printf("La suma de los dos numeros desde el %d hasta %d vale %d", comienzoIntervalo, finIntervalo, comienzoIntervaloMas2);
        comprobacionCiclo = 0;
        
      }else {
        
        System.out.printf("Error. El numero de inicio (%d) debe ser menor o igual al de final (%d). Intentalo de nuevo.%n", comienzoIntervalo, finIntervalo);
        
      }
    }
  }
  
}
