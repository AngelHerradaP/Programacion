import java.util.Locale;
import java.util.Scanner;

public class CalculoDeSalario {
  
  public static final int EUROS_POR_HORA = 12;
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduzca las horas trabajadas: ");
    
    double horasTrabajadas = Double.parseDouble(sc.nextLine());
    
    double calculoSalario = horasTrabajadas * EUROS_POR_HORA;
    
    System.out.printf(Locale.US, "Has trabajado %f, el salario es %f", horasTrabajadas, calculoSalario);
  }
}