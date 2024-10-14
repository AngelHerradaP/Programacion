import java.util.Scanner;
import java.util.Locale;

public class R01E22 {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    // Mostramos cabecera
    
    System.out.println ("=-=--=-=-=-=-=-=-=-=-=-=-=");
    System.out.println("Cuanto te sale llenar la piscina?");
    System.out.println ("=-=--=-=-=-=-=-=-=-=-=-=-=");
    
    // Solicita las medidas de la piscina para poder calcular luego
    
    System.out.println("Las siguientes medidas deben indicarse en metros");
    
    //importante indicar la magnitud porque afecta el resultado ya que calcularemos en metros cuadrados
    
    System.out.print("Di la longitud de la piscina");
    double longitud = Double.parseDouble(scan.nextLine());
    
    System.out.print("Di el ancho de la piscina ");
    double ancho = Double.parseDouble(scan.nextLine());
    
    System.out.print("Introduce la profundidad de la piscina: ");
    double profundidad = Double.parseDouble(scan.nextLine());
    
    // Pedimos tambien que nos diga cuanto sale el litro de agua
    
    System.out.print("¿Cuánto cuesta el litro de agua?: ");
    double coste_litro = Double.parseDouble(scan.nextLine());
    
    // Insertamos los calculos, primero el size de la piscina para saber cuantos litros entran
    
    double litros = longitud * ancho * profundidad * 1000;
    
    // Luego lo que costaran esos litros
    
    double precio = litros * coste_litro;

    // Imprimimos el resultado
    
    System.out.printf(Locale.US, "La piscina necesita %f litros para ser llenada, con un coste total de %f euros%n", litros, precio);
  }
}
  