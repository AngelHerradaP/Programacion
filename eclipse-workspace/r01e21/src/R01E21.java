import java.util.Scanner;
import java.util.Locale;

public class R01E21 {

  // Insertamos una constante de litros que tiene un galón para una conversion mas tarde
	
  public static final double LITROS_POR_GALON = 3.785;
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Insertamos una cabecera estetica
    
    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");
    System.out.println("Calculo el galon de leche B)");
    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");
    
    // Solicitamos que el usuario ingrese los litros y el precio del galon
    
    System.out.print("Introduce la cantidad de litros producidos en el dia: ");
    double litros = Double.parseDouble(scan.nextLine());
    
    System.out.print("Introduce el precio de un galón de leche: ");
    double precioPorGalon = Double.parseDouble(scan.nextLine());
    
    // Hacemos la conversion de litros a galonm
    
    double galones = litros / LITROS_POR_GALON;
    
    // Y calculamos el precio usando el precio por galon
    
    double precioTotal = galones * precioPorGalon;

    // Imprimimos el resultado
    
    System.out.printf(Locale.US, "%f litros equivalen a %f galones y valen %f%n", litros, galones, precioTotal);
  }
}
  