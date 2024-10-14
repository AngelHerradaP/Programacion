import java.util.Locale;
import java.util.Scanner;

public class AreaRectangulo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduce la base del rectangulo: ");
    double base = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce la altura del rectangulo: ");
    double altura = Double.parseDouble(sc.nextLine());
    double area = base * altura;
    System.out.printf(Locale.US,"El area del rectangulo es: %f", area);
  }
}
