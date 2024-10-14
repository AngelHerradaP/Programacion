import java.util.Scanner;
import java.util.Locale;

public class R01E24 {
  
  // Constante de los segundos que hay en un minuto
	
  public static final double SEGUNDOS_MINUTO = 60;

  public static void main(String[] args) {
	
	System.out.println("=-=-=---=-=-=-=--=-=--=-=-=--=-");
    System.out.println("Calculo la factura :3");
    System.out.println("=-=-=---=-=-=-=--=-=--=-=-=--=-");
    
    Scanner scan = new Scanner(System.in);
    
    // Pedimos los costes y la duración de la llamada
    
    System.out.print("Introduce el coste de establecimiento de llamada (en euros): ");
    double coste_establecimiento  = Double.parseDouble(scan.nextLine());
    
    System.out.print("Introduce el coste por minuto (en euros): ");
    double costeminuto  = Double.parseDouble(scan.nextLine());
    
    System.out.print("Introduce la duración de la llamada (en segundos): ");
    double duracion  = Double.parseDouble(scan.nextLine());
    
    // Calculamos los minutos  (REDONDEANDO PORFAVOR)
    
    double minutos = duracion / SEGUNDOS_MINUTO;
    
    // Calculamos el coste
    double coste = coste_establecimiento + costeminuto * minutos;
    
    // Imprimimos el resultado
    
    System.out.printf(Locale.US, "El coste de la llamada es de %f euros", coste);
  }
}
  