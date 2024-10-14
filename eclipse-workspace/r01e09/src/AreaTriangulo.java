import java.util.Locale;
import java.util.Scanner;

public class AreaTriangulo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduce la base del triangulo: ");
    double base = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce la altura del triangulo: ");
    double altura = Double.parseDouble(sc.nextLine());
    double area = base * altura / 2;
    System.out.printf(Locale.US,"El area del triangulo es: %f", area);
  }
}
