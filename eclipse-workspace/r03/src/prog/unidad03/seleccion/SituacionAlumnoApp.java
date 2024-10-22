package prog.unidad03.seleccion;

import java.util.Scanner;

public class SituacionAlumnoApp {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce la calificacion de Matematicas: ");
    double notaMatematicas = Double.parseDouble(sc.nextLine());
    System.out.println("Introduce la calificacion de Lengua: ");
    double notaLengua = Double.parseDouble(sc.nextLine());
    
    if (notaMatematicas < 5 && notaLengua < 5) {
      
      System.out.println("El alumno no promociona");
      
    }else if (notaMatematicas >= 5 && notaLengua >= 5) {
      
      System.out.println("El alumno promociona sin asignaturas pendientes");
      
    }else if (notaMatematicas >= 5 || notaLengua >= 5) {
      
      System.out.println("El alumno promociona con una asignatura pendiente");
  
    }
  }
  
}
