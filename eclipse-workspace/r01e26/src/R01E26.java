import java.util.Scanner;
import java.util.Locale;

public class R01E26 {
  
  // Nota de aprobado minimo
  public static final double APROBADO = 5;
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Cabecera
    
    System.out.println("DDDDDDDDDDDDDD:");
    System.out.println("¿Vali o no vali?");
    System.out.println("DDDDDDDDDDDDDD:");
    
    // Solicita las notas de las tres calificaciones
    
    System.out.print("Introduce la nota de la primera evaluación: ");
    double nota1  = Double.parseDouble(scan.nextLine());
    
    System.out.print("Introduce ahora la nota de la segunda evaluación: ");
    double nota2  = Double.parseDouble(scan.nextLine());
    
    System.out.print("Introduce por último la nota de la tercera evaluación: ");
    double nota3  = Double.parseDouble(scan.nextLine());
    
    // Hacemos la media
    
    double media = (nota1 + nota2 + nota3) / 3;
    
    // Boolean para ver si esta aprobado (iguala o supera la nota de aprobado) 
    
    boolean aprobado = media >= APROBADO;
    
    //Imprimos el resultado
    
    System.out.printf(Locale.US, "El alumno tiene una media de %f. ¿Está aprobado?: %b%n", media, aprobado);
  }
}
  