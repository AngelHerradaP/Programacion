import java.util.Scanner;
import java.util.Locale;

public class R01E23 {

  // Insertamos la resistencia del equipo como constante ya que esta es fija
  public static final double RESISTENCIA = 4;
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    // Cabecera
    System.out.println("-=-=-=-=--=-=-=-=-=-=-=-=");
    System.out.println(" calculadora de potencia electrica v3.6.9");
    System.out.println("-=-=-=-=--=-=-=-=-=-=-=-=");
    
    // Pedimos el voltaje de la fuente
    
    System.out.print("Introduce el voltaje de la fuente (en voltios): ");
    double voltaje  = Double.parseDouble(scan.nextLine());
    
    // Calculamos la intensidad 
    
    double intensidad = voltaje / RESISTENCIA;
    
    // Y luego la potencia 
    
    double potencia = voltaje * intensidad;

    // imprimimos el resultado
    
    System.out.printf(Locale.US, "La potencia de consumo del circuito es de %fW", potencia);
    
  }
}
  