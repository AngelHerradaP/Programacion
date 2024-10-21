package prog.unidad03.seleccion;
import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
public class EcuacionesSegundoGradoApp {
  
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Introduce el valor del coeficiente a: ");
      Double coeficienteA = Double.parseDouble(sc.nextLine());
      System.out.println("Introduce el valor del coeficiente b: ");
      Double coeficienteB = Double.parseDouble(sc.nextLine());
      System.out.println("Introduce el valor del coeficiente c: ");
      Double coeficienteC = Double.parseDouble(sc.nextLine());
      
      Double resultadoEcuacion = (coeficienteB * coeficienteB) -4 * coeficienteA * coeficienteC;
      
      if (resultadoEcuacion < 0) {
        
        System.out.println("La ecuacion no tiene soluciones reales");
        
      }else if (resultadoEcuacion == 0) {
        
        System.out.printf(Locale.US, "La ecuacion tiene una solucion: %f", -coeficienteB / 2 * coeficienteA);
        
      }else if (resultadoEcuacion > 0) {
        
        System.out.printf(Locale.US, "La ecuacion tiene dos soluciones: %f y %f", -coeficienteB + Math.sqrt(resultadoEcuacion) / 2 * coeficienteA
            , -coeficienteB - Math.sqrt(resultadoEcuacion) / 2 * coeficienteA);
      }
    }
}
