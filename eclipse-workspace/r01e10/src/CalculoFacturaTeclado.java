import java.util.Locale;
import java.util.Scanner;

public class CalculoFacturaTeclado {

  //Declaro la constante del IVA.
  public static final double IVA = 0.21;
  
  public static void main(String[] args) {
    //Introduzco un escaner.
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduzca la base imponible: ");
    
    double base = Double.parseDouble(sc.nextLine());
    
    double totalFactura = base * IVA + base;
    
    System.out.printf(Locale.US, "El precio sin IVA es %f, y el precio con IVA es %f", base, totalFactura);
  }
    
}
