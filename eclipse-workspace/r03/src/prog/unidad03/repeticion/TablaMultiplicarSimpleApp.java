package prog.unidad03.repeticion;
import java.util.Scanner;

public class TablaMultiplicarSimpleApp {

  public static void main(String[] args) { 
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("¿De que numero entero quieres mostrar su tabla de multiplicar?: ");
    int numeroTabla = Integer.parseInt(sc.nextLine());
    
    if (numeroTabla > 0) {
      
      System.out.printf("Tabla del %d%n", numeroTabla);
      
      for (int contador = 1 ; contador <= 10 ; contador++) {
        
        System.out.printf("%d X %d = %d%n", numeroTabla, contador, numeroTabla * contador);
          
      } 
      
    }else {
    
      System.out.println("Introduce al menos un numero");
  
    }
  }  
}
