package prog.unidad03.repeticion;
import java.util.Scanner;

public class trycatch {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Titulo del ejercicio
    System.out.println("NÚMEROS PARES E IMPARES Y SUCESIÓN DE FIBONACCI");
    
    int numero;
    
    try {
      //Pedir un número entero
      System.out.print("Introduce un número entero: ");
      numero = Integer.parseInt(sc.nextLine());
      
      //Comprobamos si es par o impar y lo mostramos por pantalla
      if(numero % 2 == 0){
        System.out.println("El número es par.");
      } else {
        System.out.println("El número es impar.");
      }
      
      //Comprobamos si es positivo o negativo y lo mostramos por pantalla
      if(numero >= 0){
        System.out.println("El número es positivo.");
      } else {
        System.out.println("El número es negativo.");
      }
      
      //Secuencia de Fibonacci
      if(numero >= 1) {
        //Como empezamos a contabilizar con un número más que en fibonacci 
        //todos los valores se reducen una posición
        if(numero == 1) {
          System.out.printf("El elemento %d de la sucesión de Fibonacci es 0%n", numero);
        } else {
          int valorAnterior = 0;
          int valorAnteriorDos = 1;
          int fibonacci = valorAnterior + valorAnteriorDos;
          
          for(int contador = 3; contador < numero; contador++) {
            valorAnterior = valorAnteriorDos;
            valorAnteriorDos = fibonacci;
            fibonacci = valorAnterior + valorAnteriorDos;
          }
          System.out.printf("El elemento %d de la sucesión de Fibonacci es %d%n", numero, fibonacci);
        }

      } else {
        System.out.println("El número introducido no se corresponde con un elemento de la sucesión de Fibonacci");
      }
      
    } catch (NumberFormatException e) {
      //Mostramos si el valor introducido no es correcto
      System.out.println("Entrada no válida. Debe introducir un número entero.");
    }
    
    

  }

}
