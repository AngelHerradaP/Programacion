import java.util.Locale;

public class ConversorCantidades {
  
  public static final double FACTOR_DE_CONVERSION = 1000;
  public static void main(String[] args) {

  double MB = 10;
  double KB = FACTOR_DE_CONVERSION * MB;
  
  System.out.printf(Locale.US, "%fMB son %fKB", MB, KB);
  }
}
