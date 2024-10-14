import java.util.Locale;
import java.util.Scanner;

public class CalculoDePresupuestoHospital {
  
  public static final double PORCENTAJE_GINECOLOGIA = 0.40;
  public static final double PORCENTAJE_TRAUMATOLOGIA = 0.35;
  public static final double PORCENTAJE_PEDIATRIA = 0.25;
 
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduzca el presuspuesto anual: ");
    double presupuestoAnual = Double.parseDouble(sc.nextLine()); 
    
    double dineroGinecologia = presupuestoAnual * PORCENTAJE_GINECOLOGIA;
    double dineroTraumatologia = presupuestoAnual * PORCENTAJE_TRAUMATOLOGIA;
    double dineroPediatria = presupuestoAnual * PORCENTAJE_PEDIATRIA;
    
    System.out.printf(Locale.US, "Con un presuspuesto anual de %f euros, a traumatologia le corresponden %f euros, a ginecologia le corresponden %f euros y a pediatria le corresponden %f euros", presupuestoAnual, dineroTraumatologia, dineroGinecologia, dineroPediatria);
  }
}
