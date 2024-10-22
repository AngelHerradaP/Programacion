package prog.unidad03.seleccion;

import java.util.Scanner;

public class MayorDeDosApp {

  public static void main(String[] args) { 
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce el primer numero: ");
    double primerNumero = Double.parseDouble(sc.nextLine());
    System.out.println("Introduce el segundo numero: ");
    double segundoNumero = Double.parseDouble(sc.nextLine());
    
    double numeroMayor = (primerNumero >= segundoNumero) ? primerNumero : segundoNumero;
    
    System.out.printf("El numero mayor es %f", numeroMayor);
    
  }
  
}
