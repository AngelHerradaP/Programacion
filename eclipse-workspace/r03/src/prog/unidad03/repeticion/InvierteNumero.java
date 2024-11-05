package prog.unidad03.repeticion;

import java.util.Scanner;

public class InvierteNumero {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce un numero entero positivo: ");
    int numeroIntroducido = Integer.parseInt(sc.nextLine());

    int multiplicador = 1;
    int numeroInvertido = 0;
    int numeroIntroducidoCp = numeroIntroducido;
    int numeroFinal = 0;
    
    if (numeroIntroducido > 0) {
      
      for (int i = 9; i < numeroIntroducido; i = i * 10 + 9) {
        
        multiplicador *= 10;
      }
      
      for (;multiplicador >= 1; multiplicador /= 10) {

        int ultimoDigito = numeroIntroducidoCp % 10;
        numeroInvertido = ultimoDigito * multiplicador;
        numeroFinal = numeroFinal + numeroInvertido;
        numeroIntroducidoCp =  numeroIntroducidoCp / 10;
        
      } 
      
      System.out.printf("El resultado de invertir el numero %d es: %d", numeroIntroducido, numeroFinal);
      
    }else if (numeroIntroducido == 0) {
      
      System.out.println("El resultado de invertir el numero 0 es: 0");
      
    }else {
      
      System.out.println("Introduce un numero entero positivo");
      
    }
  }
}
