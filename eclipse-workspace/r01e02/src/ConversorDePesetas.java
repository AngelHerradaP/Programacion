import java.util.Locale;

public class ConversorDePesetas {
  public static final double FactorDeConversionPesetas = 166.386;
  public static void main(String[] args) {
   double euros = 20;
   double pesetas = euros * FactorDeConversionPesetas;
   System.out.printf(Locale.US,"%f euros equivalen a %f pesetas", euros, pesetas);
 }
}
