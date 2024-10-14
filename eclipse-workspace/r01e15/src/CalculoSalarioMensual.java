import java.util.Locale;
import java.util.Scanner;

public class CalculoSalarioMensual {
  
  public static final double COMISION = 0.10;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduce la base salarial: ");
    double baseSalarial = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce el valor de la primera venta: ");
    double venta1 = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce el valor de la segunda venta: ");
    double venta2 = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce el valor de la tercera venta: ");
    double venta3 = Double.parseDouble(sc.nextLine());
    
    
    double valorTotalVentas = venta1 + venta2 + venta3; 
    double dineroExtra = valorTotalVentas * COMISION;
    double salarioTotal = baseSalarial + dineroExtra;
    
    System.out.printf(Locale.US, "El salario mensual con la comision de las ventas es de %f ", salarioTotal);
  }
}
