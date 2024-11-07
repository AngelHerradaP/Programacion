package prog.unidad03.repeticion;

import java.util.Scanner;

public class TrianguloNumerico {

  public static void main(String[] args) { 
    
    Scanner sc = new Scanner(System.in);
      
      System.out.println("Introduce la altura del triangulo: ");
      int alturaTriangulo = Integer.parseInt(sc.nextLine());
      int alturaTrianguloCp = alturaTriangulo;
      
      for (int d = 1; d <= alturaTriangulo; d++) {
      
        for (int i = 1; i < alturaTrianguloCp ; i++) {
          
          System.out.print(" ");
          
        }
        
        for (int i = 1;i == 1; i++) {
          
          System.out.print(i);
          
        }
        
        if (alturaTriangulo > 1) {
          
          for (; alturaTrianguloCp > 1; alturaTrianguloCp--) {
  
            System.out.print(alturaTrianguloCp - 1);
  
          } 
        }
        System.out.printf("%n");
        alturaTrianguloCp--;
      }
    }     
  }
