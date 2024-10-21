package prog.unidad03.seleccion;

import java.util.Scanner;
public class CalculadoraSalarioApp {
  public static final int EUROS_POR_HORA = 16;
  public static final int EUROS_POR_HORA_EXTRA = 20;
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce las horas trabajadas: ");
    double horasTrabajadas = Double.parseDouble(sc.nextLine());
    
    double salarioExtra = 0;
    double horasExtra = 0;
    
    if (horasTrabajadas > 40) {
      
      horasExtra = horasTrabajadas - 40;
      salarioExtra = (horasTrabajadas - 40) * EUROS_POR_HORA_EXTRA;
      horasTrabajadas = 40;
    }
    
    double salarioTotal = salarioExtra + 40 * EUROS_POR_HORA;
    
    System.out.printf("El salario por trabajar %f horas normales y %f horas extra es de %f", horasTrabajadas, horasExtra, salarioTotal);
  }
}
