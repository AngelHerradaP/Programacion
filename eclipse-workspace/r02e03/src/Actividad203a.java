
public class Actividad203a {
  public static void main(String[] args) {
    CuentaCorriente cuenta = new CuentaCorriente("11111");
    
    cuenta.ingresar(1000);
    System.out.printf("El saldo de la cuenta es de %f%n", cuenta.getSaldo());
    
    cuenta.retirar(1100);
    System.out.printf("El saldo de la cuenta es de %f%n", cuenta.getSaldo());
    
    cuenta.retirar(900);
    System.out.printf("El saldo de la cuenta es de %f%n", cuenta.getSaldo());
    
    cuenta.retirar(100);
    System.out.printf("El saldo de la cuenta es de %f%n", cuenta.getSaldo());
  
    cuenta.ingresar(350);
    System.out.printf("El saldo de la cuenta es de %f%n", cuenta.getSaldo());
  
    cuenta.retirar(400);
    System.out.printf("El saldo de la cuenta es de %f%n", cuenta.getSaldo());
  }
}
