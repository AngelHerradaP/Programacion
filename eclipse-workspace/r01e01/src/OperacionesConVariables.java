import java.util.Locale;

public class OperacionesConVariables {
  public static void main(String[] args) {
    int valor1 = 256;
    int valor2 = 398;
    int suma = valor1 + valor2;
    int diferencia = valor1 - valor2;
    int producto = valor1 * valor2;
    int cociente = valor1 / valor2;
    int modulo = valor1 % valor2;
    System.out.printf(Locale.US, "Los valores son: %d y %d.%nLa suma: %d.%nLa diferecia: %d.%nEl producto: %d.%nEl cociente: %d.%nEl modulo: %d.%n", valor1, valor2, suma, diferencia, producto, cociente, modulo);
  }
}
