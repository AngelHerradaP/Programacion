import java.util.Locale;
import java.util.Scanner;

public class PorcentajeDeInversion {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduzca el dinero invertido por la primera persona: ");
    double dineroInvertido1 = Double.parseDouble(sc.nextLine());
    System.out.print("Introduzca el dinero invertido por la segunda persona: ");
    double dineroInvertido2 = Double.parseDouble(sc.nextLine());
    System.out.print("Introduzca el dinero invertido por la tercera persona: ");
    double dineroInvertido3 = Double.parseDouble(sc.nextLine());    
    
    double valorTotalDinero = dineroInvertido1 + dineroInvertido2 + dineroInvertido3; 
    double porcentajeTotalInvertido1 = dineroInvertido1 * 100 / valorTotalDinero;
    double porcentajeTotalInvertido2 = dineroInvertido2 * 100 / valorTotalDinero;
    double porcentajeTotalInvertido3 = dineroInvertido3 * 100 / valorTotalDinero;
    
    System.out.printf(Locale.US, "El porcentaje de inversion de la primera persona es %f%%, el de la segunda %f%% y el de la tercera es %f%%", porcentajeTotalInvertido1, porcentajeTotalInvertido2, porcentajeTotalInvertido3);
  }
}
