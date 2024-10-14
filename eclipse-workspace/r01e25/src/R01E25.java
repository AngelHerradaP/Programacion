import java.util.Scanner;

public class R01E25 {
	
  public static void main(String[] args) {
	  
    Scanner scan = new Scanner(System.in);

    // Cabecera
    
    System.out.println("2121212121212121212");
    System.out.println("¿Sera par o impar?");
    System.out.println("2121212121212121212");
    
    // Pedimos el numero
    
    System.out.print("Dame el numero y te lo dire ");
    int numero  = Integer.parseInt(scan.nextLine());
    
    // Boolean sirve para comparar y luego insertamos el calculo para saber si es par (true) o no (false)
    
    boolean par = (numero % 2) == 0;
    
    // Mostramos resultado
    
    System.out.printf("¿Es el número %d par?: %b%n", numero, par);
    
  }
}
  