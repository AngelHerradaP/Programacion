import java.util.Scanner;
import java.util.Locale;

public class R01E29 {

  // Colocamos los rangos como constantes que van a definir nuestros limites
  public static final double RANGO_MINIMO= 20;
  public static final double RANGO_MAXIMO= 30;
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Cabecera, confesion: se la he robado al profe porque se ve profesional
    //PD: Int dont working, USAR DOUBLE
    
    System.out.println("¿ENTRE " + RANGO_MINIMO + " Y " + RANGO_MAXIMO + "?");
    System.out.println("-------------------------------------------------------------------------------------");
    
    // Pedimo un numero
    
    System.out.print("Give me a number,  please be a number entero");
    double number = Double.parseDouble(scan.nextLine());
    
    // Comprobamos que este en el rango pedido
    
    boolean rango = number >= RANGO_MINIMO && number < RANGO_MAXIMO;
    
    // imprimimos el resultado
    
    System.out.printf(Locale.US, "¿Está el número %f comprendido entre %f y %f (sin incluir %f)?: %b%n", number, RANGO_MINIMO, RANGO_MAXIMO, RANGO_MAXIMO, rango);
  
  }
}
  