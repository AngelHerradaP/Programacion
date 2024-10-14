import java.util.Locale;
import java.util.Scanner;

public class ConversorDePesetasTeclado2 {
  public static final double FactorDeConversionPesetas = 166.386;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduce los euros: ");
    double euros = Double.parseDouble(sc.nextLine());
    double pesetas = euros * FactorDeConversionPesetas;
    
   System.out.printf(Locale.US,"%f euros equivalen a %f pesetas", euros, pesetas);
 }
}
