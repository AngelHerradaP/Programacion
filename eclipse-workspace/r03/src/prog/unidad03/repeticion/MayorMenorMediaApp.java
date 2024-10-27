package prog.unidad03.repeticion;
import java.util.Scanner;

public class MayorMenorMediaApp {
  public static void main(String[] args) { 
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("¿Cuantos numeros deseas introducir?: ");
    int numerosIntroducidos = Integer.parseInt(sc.nextLine());
    
    if (numerosIntroducidos > 0) {
      
      System.out.println("Introduce el numero 1: ");
      double numero = Integer.parseInt(sc.nextLine());
      
      double numeroMayor = numero;
      double numeroMenor = numero;
      double numeroMedia = numero;
      
      for (int contador = 2 ; contador <= numerosIntroducidos ; contador++) {
        
        System.out.printf("Introduce el numero %d: ", contador);
        numero = Integer.parseInt(sc.nextLine());
        
        numeroMayor = (numero >= numeroMayor) ? numero : numeroMayor;
        
        numeroMenor = (numero <= numeroMenor) ? numero : numeroMenor;
        
        numeroMedia += numero;
          
        } 

       System.out.printf("El mayor de los numeros introducidos ha sido %f%n", numeroMayor);
       System.out.printf("El menor de los numeros introducidos ha sido %f%n", numeroMenor);
       System.out.printf("La media de todos los numeros vale %f%n", numeroMedia / numerosIntroducidos);
      
    }else {
    
      System.out.println("Introduce al menos un numero");
  
    }
  }  
}