import java.util.Scanner;

public class OperacionesConNumerosEnteros {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduce el primer numero entero: ");
    int numero1 = Integer.parseInt(sc.nextLine());
    System.out.print("Introduce el segundo numero entero: ");
    int numero2 = Integer.parseInt(sc.nextLine());
    int suma = numero1 + numero2;
    int diferencia = numero1 - numero2;
    int producto = numero1 * numero2;
    int division = numero1 / numero2;
    int modulo = numero1 % numero2;
    System.out.printf("La suma de los dos numeros es: %d%nLa diferencia de los dos numeros es: %d%nEl producto de los dos numeros es: %d%nLa division de los dos numeros es: %d%nEl modulo de los dos numeros es: %d%n", suma, diferencia, producto, division, modulo);
  }
}
