package prog.unidad03.repeticion;

import java.util.Scanner;

public class CuentaParesApp {

  public static void main(String[] args) { 
    
    Scanner sc = new Scanner(System.in);
    
      int cantidadPar = 0;
    
      System.out.print("¿Cuantos numeros pares deseas introducir?: ");
      int numerosIntroducidos = Integer.parseInt(sc.nextLine());
        if (numerosIntroducidos > 0) {
          
          do {
            
            System.out.print("Introduce un numero entero:  ");
            int numeroEntero = Integer.parseInt(sc.nextLine());
            
            if (numeroEntero % 2 == 0) {
              
              cantidadPar++;
            }
            
            if (cantidadPar == numerosIntroducidos) {
              
              System.out.printf("%n¡Ya has introducido %d numeros pares!%n", numerosIntroducidos);
              
            }else{
           
              System.out.printf("Te quedan %d numeros pares por introducir%n", numerosIntroducidos - cantidadPar);
              
            }
            
          }while (cantidadPar < numerosIntroducidos);
          
        }else {
            
            System.out.println("Al menos introduce un numero. Terminando programa");
            
        }  
  }  
}
