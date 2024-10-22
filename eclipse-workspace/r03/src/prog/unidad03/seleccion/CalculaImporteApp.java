package prog.unidad03.seleccion;

import java.util.Locale;
import java.util.Scanner;

public class CalculaImporteApp {
  public static final double PORCENTAJE_DESCUENTO = 0.2;
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce el importe de la compra en euros: ");
    double importeCompra = Double.parseDouble(sc.nextLine());
    double umbralDescuento = 100;
    
    if (importeCompra > umbralDescuento) {
      
      double importePagar = importeCompra * PORCENTAJE_DESCUENTO;
      System.out.printf(Locale.US, "Como la compra es superior a %f, la compra tiene un %f%% de descuento. El importe a pagar es de %f", umbralDescuento, PORCENTAJE_DESCUENTO * 100, importePagar);
      
    }else if (importeCompra <= umbralDescuento) {
      
      System.out.printf(Locale.US, "Como la compra no es superior a %f, la compra no tiene descuento. El importe a pagar es de %f",umbralDescuento, importeCompra);
      
    }else {
      
      System.out.println("pon un importe de compra valido");
      
    }
  }
}
