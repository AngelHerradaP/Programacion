package prog.unidad03.examen;

import java.util.Locale;
import java.util.Scanner;

public class SuperEstadisticaApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Inicializo las variables para poder referirme a ellas fuera de los bucles.
    int numeroComprobacionError = 0;
    int numeroEntero = 1;
    int contador = 0;
    int numeroEnteroCopia = numeroEntero;
    double sumaNumeroEntero = 0;
    double mediaNumeroEntero =  0;
    
    do {

      numeroComprobacionError = 0;
      
      try {

        do {
          
          //Pido por pantalla el numero entero.
          System.out.println("Introduce un numero entero (0 para terminar): ");
          numeroEntero = Integer.parseInt(sc.nextLine());
          
          boolean comprobacionImpar = false;
          
          //Compruebo si el numero que se ha introducido es 0 para no calcular si es positivo, negativo, par o impar.
          if (numeroEntero != 0) {
            
            numeroEnteroCopia = numeroEntero;
            
            //Compruebo si el numero es par y lo imprimo por pantalla.
            if (numeroEntero % 2 == 0) {

              System.out.printf("El numero %d es par%n", numeroEntero);

            } else {

              System.out.printf("El numero %d es impar%n", numeroEntero);
              comprobacionImpar = true;
              
            }
            
            //Compruebo si el numero es positivo y lo imprimo por pantalla.
            if (numeroEntero >= 0) {

              System.out.printf("El numero %d es positivo%n", numeroEntero);

            } else {

              System.out.printf("El numero %d es negativo%n", numeroEntero);

            } 
          }
          
          //Compruebo si el numero no entra dentro del rango solicitado y si es impar (-11 a 20 exceptuando -1 y 3).
          if (numeroEntero == -1 || numeroEntero == 3 || comprobacionImpar == true && numeroEntero <= -11 || numeroEntero > 20) {
            
            System.out.printf("El numero %d entra en el calculo%n", numeroEnteroCopia);
            sumaNumeroEntero = numeroEnteroCopia + sumaNumeroEntero;
            contador++;
            mediaNumeroEntero = sumaNumeroEntero / contador;
            
          }
          
          //Muestro por pantalla los resultados de la media y la cantidad de numeros que cumplen con la condicion.
          if (numeroEntero == 0) {
            System.out.printf(Locale.US, "La media de los numeros que cumplen la condicion vale: %f%n", mediaNumeroEntero);
            System.out.printf("La cantidad de los numeros que cumplen la condicion es de: %d%n", contador);
          }
          
        }while (numeroEntero != 0);

      } catch (NumberFormatException e) {

        //Imprimo por pantalla el mensaje de error en caso de que no introduzcas un numero entero.
        System.out.println("El dato introducido no es un numero valido.");
        numeroComprobacionError = 1;
        
      } 
      
    } while (numeroComprobacionError == 1);

  }
}
