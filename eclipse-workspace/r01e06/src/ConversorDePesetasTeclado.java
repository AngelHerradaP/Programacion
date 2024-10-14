import java.util.Locale;
import java.util.Scanner;

public class ConversorDePesetasTeclado {
  public static final double FactorDeConversionPesetas = 166.386;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduce las pesetas: ");
    double pesetas = Double.parseDouble(sc.nextLine());
    double euros = pesetas / FactorDeConversionPesetas;
    
   System.out.printf(Locale.US,"%f pesetas equivalen a %f euros", pesetas, euros);
 }
}