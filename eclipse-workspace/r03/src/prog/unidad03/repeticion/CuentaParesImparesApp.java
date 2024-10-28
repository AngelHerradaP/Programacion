package prog.unidad03.repeticion;
import java.util.Scanner;

public class CuentaParesImparesApp {

  public static void main(String[] args) { 
    
    Scanner sc = new Scanner(System.in);
    
    int numerosPares = 0;
    int numerosImpares = 0;
    
    System.out.println("Cuantos numeros deseas introducir?: ");
    int numerosIntroducidos = Integer.parseInt(sc.nextLine());
    
    for (int contador = 1 ; contador <= numerosIntroducidos ; contador++) {
    
      System.out.printf("Introduce el numero %d: ", contador);
      int numeroParImpar = Integer.parseInt(sc.nextLine());
      
      if (numeroParImpar % 2 == 0) {
        
        System.out.printf("El numero %d es par%n", numeroParImpar);
        numerosPares++;
      
      }else {
          
        System.out.printf("El numero %d es impar%n", numeroParImpar);
        numerosImpares++;
        
      } 
    }

    System.out.printf("Se han introducido %d numeros pares y %d numeros impares", numerosPares, numerosImpares);
  
  } 
  
}
