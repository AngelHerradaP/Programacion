package prog.unidad02.actividad206;

import java.util.Scanner;
import java.util.Random;
import es.iespablopicasso.programacion.bloque02.figuras.Paralelogramo;

public class ParalelogramosApp {
  
  public static void main(String[] args) { 
    
    Scanner sc = new Scanner(System.in);
   
    //Pido los datos del paralelogramo
    System.out.println("Introduzca la longitud de los lados horizontales: ");
    double longitudHorizontal = Double.parseDouble(sc.nextLine());
    System.out.println("Introduzca el límite mínimo de los posibles valores de la longitud del lado vertical: ");
    double limiteMinVertical = Double.parseDouble(sc.nextLine());
    System.out.println("Introduzca el límite máximo de los posibles valores de la longitud del lado vertical: ");
    double limiteMaxVertical = Double.parseDouble(sc.nextLine());
    
    //Creo un objeto de la clase random
    Random numeroAleatorio = new Random();
    
    //Hago una variable para guardar el numero aleatorio que va a ser el lado vertical del paralelograma
    double ladoVerticalAleatorio = numeroAleatorio.nextDouble(limiteMinVertical, limiteMaxVertical);
    
    //Imprimo por pantalla la longitud del lado vertical
    System.out.printf("La longitud del lado vertical obtenida al azar es de: %f%n", ladoVerticalAleatorio);
    
    //Creo un objeto de la clase paralelograma con las longitudes del lado horizontal y vertical
    Paralelogramo paralelogramo = new Paralelogramo(longitudHorizontal, ladoVerticalAleatorio);
    
    //Obtengo el area y el perimetro
    String areaPerimetroParalelogramo = paralelogramo.getAreaPerimetro();
    
    //Separo el area del perimetro y lo guardo
    String areaParalelogramo = (String) areaPerimetroParalelogramo.subSequence(0, 16);
    
    //Separo el perimetro del area y lo guardo
    String perimetroParalelogramo = (String) areaPerimetroParalelogramo.substring(18);
    
    //Imprimo por pantalla lo que vale el area
    System.out.printf("El area del paralelogramo vale: %s%n", areaParalelogramo);
    
    //Imprimo por pantalla lo que vale el perimetro
    System.out.printf("El perimetro del paralelogramo vale: %s%n", perimetroParalelogramo);
    
    //Pido el factor de escalado
    System.out.println("Introduzca el factor real positivo por el que quiere ampliar: ");
    double factorEscala = Double.parseDouble(sc.nextLine());
  }
}
