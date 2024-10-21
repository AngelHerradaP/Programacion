package prog.unidad03.seleccion;

import java.util.Scanner;

public class NumeroCifrasApp {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce el numero para saber cuantas cifras tiene: ");
    int numero = Integer.parseInt(sc.nextLine());
    
    String numeroCifra = "";
    
    if (numero > 999 || numero < -999) {
      
      numeroCifra = "mas de tres cifras";
      
    }else if (numero > 99 || numero < -99) {
      
      numeroCifra = "tres cifras";
      
    }else if (numero > 9 || numero < -9) {
      
      numeroCifra = "dos cifras";
      
    }else if (numero <= 9 || numero >= -9) {
      
      numeroCifra = "una cifra";
      
    }
    
    System.out.printf("El numero %d tiene %s" , numero, numeroCifra);
  }
  
}
