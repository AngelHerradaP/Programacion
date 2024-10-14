import java.util.Locale;

public class CalculoVolumen {
  
  public static final double PI = 3.14159;
  
  public static void main(String[] args) {
    
    double altura = 10;
    
    double radio = 5.3;
    
    double volumen = (PI * (radio * radio) * altura) / 3;
    
    System.out.printf(Locale.US, "El volumen de un cono con %fcm de altura y %fcm de radio es: %fcm³", altura, radio, volumen);
    
  }
}
