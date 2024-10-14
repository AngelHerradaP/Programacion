import java.util.Scanner;

public class R01E28 {
	
  public static void main(String[] args) {
	  
    Scanner scan = new Scanner(System.in);

    // Cabecera
    System.out.println("???????????????????????");
    System.out.println("Comparador de edades");
    System.out.println("???????????????????????");
    
    //ponemos una nota para los usuarios curiosos que piensan que la edad no es un entero
    
    System.out.println("Nota para el usuario, recuerde que las edades son numeros enteros.");
    
    // Pedimos las edades de las tres personas
    
    System.out.print("Edad de la primera persona: ");
    int persona1  = Integer.parseInt(scan.nextLine());
    
    System.out.print("Edad de la segunda: ");
    int persona2 = Integer.parseInt(scan.nextLine());
    
    System.out.print("Edad de la tercera: ");
    int persona3  = Integer.parseInt(scan.nextLine());
    
    // Comparamos las edades para saber quien es mayor, quien es menor y la weabada
    
    boolean edades = persona1 > persona2 && persona2 > persona3;
    
    // Muestra el resultado
    
    System.out.printf("¿Es la primera persona mayor que la segunda y la segunda mayor que la tercera?: %b%n", edades);
    System.out.println("Si sale false, es que una de las condiciones no se ha cumplido.");
    
  }
}
  