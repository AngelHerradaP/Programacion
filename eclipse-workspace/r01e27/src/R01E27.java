import java.util.Scanner;

public class R01E27 {
  
  // Edad mínima para tener permiso para conducir legalmente
	
  public static final double EDAD_MINIMA = 18;
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    // Cabecera
    System.out.println("-=-=-=-=-=---=-=-=-=-=");
    System.out.println("Tiene carnet legal o deberias bajarte ya del auto?");
    System.out.println("-=-=-=-=-=---=-=-=-=-=");
    
    // pedimo la edad
    System.out.print("Introduce la edad de la persona de dudoso manejo ");
    int edad  = Integer.parseInt(scan.nextLine());
    
    // Boolean que pensara por nosotros si tiene la edad necesaria o no por medio de un true y false
    
    boolean tienepermiso = edad >= EDAD_MINIMA;
    
    // Y muestra el resultado
    System.out.printf("Tu conductor tiene una edad de %d. ¿Puede conducir?: %b%n", edad, tienepermiso);
    System.out.println("Si el resultado es true, siga tranca");
    System.out.println("Si es false, salta por la ventana, es mas seguro");
    System.out.println("Si quieres saber el riesgo, usa la calculadora de riesgo v3.4 que esta en el fichero 2");
  }
}
  