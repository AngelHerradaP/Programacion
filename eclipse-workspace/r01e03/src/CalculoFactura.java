import java.util.Locale;

public class CalculoFactura {
  public static final double IVA = 0.21;
  public static void main(String[] args) {
    double base = 100.100;
    double totalFactura = base * IVA + base;
    System.out.printf(Locale.US,"El precio sin IVA es %f, y el precio con IVA es %f", base, totalFactura);
  }
    
}
