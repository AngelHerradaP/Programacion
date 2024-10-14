import java.util.Locale;

public class CalculoDeNota {
  public static void main(String[] args) {
    
    double primeraNota = 7;
    double notaDeseada = 8.5;
    double segundaNota = (notaDeseada + primeraNota) / 2;
    
    System.out.printf(Locale.US, "Teniendo un %f de primera nota, para sacar un %f necesitas sacar un %f en la segunda nota.", primeraNota, notaDeseada, segundaNota);
  }
}
