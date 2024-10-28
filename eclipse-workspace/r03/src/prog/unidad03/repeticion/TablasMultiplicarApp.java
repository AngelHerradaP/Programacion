package prog.unidad03.repeticion;

public class TablasMultiplicarApp {

  public static void main(String[] args) { 

    int contador2 = 1;
    
    while (contador2 <= 10) {
      
      System.out.printf("%nTabla del %d%n", contador2);
   
      int contador = 1;
    
      for (; contador <= 10 ; contador++) {
        
        System.out.printf("%d X %d = %d%n", contador2, contador, contador2 * contador);
        
        if (contador == 10) {

          contador2++;
        } 
      }
    }
  }
}  
