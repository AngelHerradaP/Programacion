import java.util.Locale;
import java.util.Scanner;

public class Actividad203b {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce los datos del primer numero complejo: ");
    System.out.println("Introduce la parte real: ");
    double parteReal1 = Double.parseDouble(sc.nextLine());
    System.out.println("Introduce la parte imaginaria: ");
    double parteImaginaria1 = Double.parseDouble(sc.nextLine());
    
    System.out.println("Introduce los datos del segundo numero complejo: ");
    System.out.println("Introduce la parte real: ");
    double parteReal2 = Double.parseDouble(sc.nextLine());
    System.out.println("Introduce la parte imaginaria: ");
    double parteImaginaria2 = Double.parseDouble(sc.nextLine());
    
    Complejo complejo1 = new Complejo(parteReal1, parteImaginaria1);
    Complejo complejo2 = new Complejo(parteReal2, parteImaginaria2);
    
    Complejo suma = complejo1.sumar(complejo2);
    Complejo resta = complejo1.restar(complejo2);
    Complejo producto = complejo1.multiplicar(complejo2);
    Complejo division = complejo1.dividir(complejo2);
    
    String resultadoSuma = suma.toString();
    String resultadoResta = resta.toString();
    String resultadoProducto = producto.toString();
    String resultadoDivision = division.toString();
    
    System.out.printf(Locale.US, "La suma es: %s.%nLa resta es %s.%nEl producto es %s.%nLa division es %s", resultadoSuma, resultadoResta, resultadoProducto, resultadoDivision);
  }

}
