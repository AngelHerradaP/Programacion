
public class ComprobacionPar {
  public static void main(String[] args) {
    int numero = 445;
    int operacionComprobacion = numero % 2;
    boolean condicionPar = operacionComprobacion == 0;
    System.out.printf("¿Es %d par? %b", numero, condicionPar);
  }
}
