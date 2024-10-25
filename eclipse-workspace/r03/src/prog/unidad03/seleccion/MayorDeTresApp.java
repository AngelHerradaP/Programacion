package prog.unidad03.seleccion;

import java.util.Scanner;

public class MayorDeTresApp {

  public static void main(String[] args) { 
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce el primer numero: ");
    double primerNumero = Double.parseDouble(sc.nextLine());
    System.out.println("Introduce el segundo numero: ");
    double segundoNumero = Double.parseDouble(sc.nextLine());
    System.out.println("Introduce el tercer numero: ");
    double tercerNumero = Double.parseDouble(sc.nextLine());
    
    double numeroMayor1 = (primerNumero >= segundoNumero ) ? primerNumero : segundoNumero;
    double numeroMayor2 = (numeroMayor1 >= tercerNumero) ? numeroMayor1 : tercerNumero;
    
    System.out.printf("El numero mayor es %f", numeroMayor2);
    
  }
  
}

