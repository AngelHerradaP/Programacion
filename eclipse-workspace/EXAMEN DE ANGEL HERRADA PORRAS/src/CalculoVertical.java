import java.util.Locale;
import java.util.Scanner;

public class CalculoVertical {
  
  //Declaro las constantes
  public static final double ACELERACION_GRAVEDAD = 9.8;
  public static final double FACTOR_DE_CONVERSION_METROS_A_PIES = 3.28;
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Imprimo por pantalla la cabecera
    System.out.println("EXAMEN DE ANGEL HERRADA PORRAS. CALCULO DE LANZAMIENTO VERTICAL");
    
    //Pido por teclado la velocidad incial del objeto
    System.out.print("Introduzca la velocidad inicial del objeto (en m/s): ");
    double velocidadInicialObjeto = Double.parseDouble(sc.nextLine());
    
    //Realizo los calculos de la altura maxima y el tiempo de la altura maxima
    double tiempoAlturaMaxima = (velocidadInicialObjeto / ACELERACION_GRAVEDAD);
    double alturaMaxima = velocidadInicialObjeto * tiempoAlturaMaxima - ACELERACION_GRAVEDAD * (tiempoAlturaMaxima * tiempoAlturaMaxima) / 2;
    
    //Realizo los calculos de los pies y realizo la conversion de tipos
    double pies = alturaMaxima * FACTOR_DE_CONVERSION_METROS_A_PIES;
    int piesSinDecimales = (int) pies;
    
    //Imprimo por pantalla la informacion de la altura en metros, en pies y el tiempo necesario 
    System.out.printf(Locale.US, "La altura maxima en metros es de %f%nEsta altura equivale a %d pies%nEl tiempo necesario es %f segundos", alturaMaxima, piesSinDecimales, tiempoAlturaMaxima);
  }
}