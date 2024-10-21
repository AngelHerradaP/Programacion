package prog.unidad03.seleccion;

import java.util.Scanner;

public class EsParImparApp {

  public static void main(String[] args) { 
  
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce un numero entero: ");
    double numero = Double.parseDouble(sc.nextLine());
    
    String parImpar = (numero % 2 == 0) ? "par" : "impar";
    
    System.out.printf("El numero %f es %s", numero, parImpar);
    
  }
}
