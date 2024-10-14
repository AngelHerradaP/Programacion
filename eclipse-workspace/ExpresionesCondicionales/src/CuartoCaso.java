
public class CuartoCaso {
  public static void main(String[] args) {
    int edadJuan = 3;
    int edadMaria = 4;
    int edadLuisa = 5;
    boolean condicion = edadMaria < edadJuan || edadMaria > edadLuisa;
    System.out.println("¿Esta la edad de Maria no comprendida entre la edad de Juan y Luisa? "+condicion);
  }
}