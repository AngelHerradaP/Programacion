package prog.unidad03.seleccion;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraBasicaApp {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce la operacion a realizar (s para suma, r para resta, p para producto y d para division: ");
    char tipoOperacion = sc.nextLine().charAt(0);
    
    if (tipoOperacion == 's' || tipoOperacion == 'r' || tipoOperacion == 'p' || tipoOperacion == 'd') {
     
      System.out.println("Introduce el primer operando: ");
      Double primerOperando = Double.parseDouble(sc.nextLine());
      System.out.println("Introduce el segundo operando: ");
      Double segundoOperando = Double.parseDouble(sc.nextLine());
      
      
      
      switch (tipoOperacion) {
        case 's': {
          
          System.out.printf(Locale.US, "El resultado de la suma de %f y %f es: %f", primerOperando, segundoOperando, primerOperando + segundoOperando);
          break;
          
        }
        case 'r': {
              
          System.out.printf(Locale.US, "El resultado de la resta de %f y %f es: %f", primerOperando, segundoOperando, primerOperando - segundoOperando);
          break;
          
        }
        case 'p': {
          
          System.out.printf(Locale.US, "El resultado de la multiplicacion de %f y %f es: %f", primerOperando, segundoOperando, primerOperando * segundoOperando);
          break;
          
        }
        case 'd': {
          
          System.out.printf(Locale.US, "El resultado de la division de %f y %f es: %f", primerOperando, segundoOperando, primerOperando / segundoOperando);
          
        }
      }
      
    }else {
      
      System.out.println("Introduce un tipo de operacion valido.");
      
    }
  }
}