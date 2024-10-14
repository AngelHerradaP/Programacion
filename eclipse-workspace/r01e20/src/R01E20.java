import java.util.Scanner;
import java.util.Locale;

public class R01E20 {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    // Cabecera fachera
    
    System.out.println("?>?>?>?>?>?>?>?>?>?>?>");
    System.out.println("Calculo el area por ti pa', para evitarte flashbacks de geometria");
    System.out.println("?>?>?>?>?>?>?>?>?>?>?>");
    
    // Pedimos que ingrese las longitudes de los lados A, B y C
    
    System.out.print("Introduce la longitud del lado A: ");
    
    double ladoA = Double.parseDouble(scan.nextLine());
    
    System.out.print("Introduce la longitud del lado B: ");
    
    double ladoB = Double.parseDouble(scan.nextLine());
    
    System.out.print("Introduce la longitud del lado C: ");
    
    double ladoC = Double.parseDouble(scan.nextLine());
    
    // El área tiene dos partes. En la inferior es un rectángulo de lados B y C  y en la parte superior un triángulo de base B y altura A - C
    //Por ende deducimos las siguientes formulas. 
     
    double area_inferior = ladoB * ladoC;
    
    double area_superior = ladoB * (ladoA - ladoC) / 2;
    
    double area_total = area_inferior + area_superior;

    // Imprimimos el resultado
    
    System.out.printf(Locale.US, "El área total de la parcela es de %f%n", area_total);
  }
}
  