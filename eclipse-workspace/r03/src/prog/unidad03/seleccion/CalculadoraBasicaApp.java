package prog.unidad03.seleccion;

import java.util.Scanner;

public class CalculadoraBasicaApp {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce la operacion a realizar (s para suma, r para resta, p para producto y d para division: ");
    String tipoOperacion = sc.nextLine();
    
    if (tipoOperacion == "s" || tipoOperacion == "r" || tipoOperacion == "p" || tipoOperacion == "d") {
     
      System.out.println("Introduce el primer operando: ");
      String primerOperando = sc.nextLine();
      System.out.println("Introduce el segundo operando: ");
      String segundoOperando = sc.nextLine();
      
      switch (tipoOperacion) {
        case "s": {
          
          
          
        }
        case "r": {
              
          
          
        }
        case "p": {
          
          
          
        }
        case "d": {
          
          
          
        }
      }
      
    }else {
      
      System.out.println("Introduce un tipo de operacion valido.");
    
    }
  }
}