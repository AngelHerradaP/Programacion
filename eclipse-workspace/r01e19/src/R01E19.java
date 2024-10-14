import java.util.Scanner;
import java.util.Locale;

public class R01E19 {

  // Ingresamos la constante de pi
	
  public static final double PI = 3.1415926;

  public static void main(String[] args) {
	  
    Scanner scan = new Scanner(System.in);

    //cabecera fachera
    
    System.out.println("Calcula la circuferencia C:");
    System.out.println("--------");
    
    // Solicitamos que el usuario ingrese el radio
    
    System.out.print("Introduce el radio del círculo");
    double radio = Double.parseDouble(scan.next());
    
    // Insertamos las formulas de calculo
    
    double circunferencia = 2 * PI * radio;
    double area = PI * radio * radio;

    // Y las imprimimos
    
    System.out.printf(Locale.US, "La circunferencia del círculo es de %f y su área es %f%n", circunferencia, area);
  }
}
  