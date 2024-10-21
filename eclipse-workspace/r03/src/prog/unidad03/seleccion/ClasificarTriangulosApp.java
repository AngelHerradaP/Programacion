package prog.unidad03.seleccion;
import java.util.Scanner;

public class ClasificarTriangulosApp {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce la longitud del primer lado: ");
    double lonLado1 = Double.parseDouble(sc.nextLine());
    System.out.println("Introduce la longitud del segundo lado: ");
    double lonLado2 = Double.parseDouble(sc.nextLine());
    System.out.println("Introduce la longitud del tercer lado: ");
    double lonLado3 = Double.parseDouble(sc.nextLine());
 
    String tipoTriangulo = "Introduce una longitud valida";
    
    if (lonLado1 == lonLado2 && lonLado1 == lonLado3) {
      
      tipoTriangulo = "Equilatero";
      
    }else if (lonLado1 == lonLado2 || lonLado1 ==lonLado3 || lonLado2 == lonLado3) {
      
      tipoTriangulo = "Isosceles";
      
    }else if (lonLado1 != lonLado2 && lonLado1 !=lonLado3 && lonLado2 != lonLado3) {
      
      tipoTriangulo = "Escaleno";
      
    }
    
    System.out.printf("El triangulo es %s" , tipoTriangulo);
  }
}
