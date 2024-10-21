import java.util.Scanner;

import paquete1.Fraccion;
import paquete2.*;

public class Actividad204b {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce los datos de la primera fraccion.");
    System.out.println("Introduce el numerador: ");
    int numerador1 = Integer.parseInt(sc.nextLine());
    System.out.println("Introduce el denominador: ");
    int denominador1 = Integer.parseInt(sc.nextLine());
    
    System.out.println("Introduce los datos de la segunda fraccion.");
    System.out.println("Introduce el numerador: ");
    int numerador2 = Integer.parseInt(sc.nextLine());
    System.out.println("Introduce el denominador: ");
    int denominador2 = Integer.parseInt(sc.nextLine());
    
    Fraccion fraccion1 = new Fraccion(numerador1, denominador1);
    Fraccion fraccion2 = new Fraccion(numerador2, denominador2);
    
    Fraccion suma = fraccion1.suma(fraccion2);
    Fraccion resta = fraccion1.resta(fraccion2);
    Fraccion producto = fraccion1.producto(fraccion2);
    Fraccion division = fraccion1.division(fraccion2);
    
    
    int numeradorSuma = suma.getNumerador();
    int denominadorSuma = suma.getDenominador();
    int numeradorResta = resta.getNumerador();
    int denominadorResta = resta.getDenominador();
    int numeradorProducto = producto.getNumerador();
    int denominadorProducto = producto.getDenominador();
    int numeradorDivision = division.getNumerador();
    int denominadorDivision = division.getDenominador();
    
    System.out.printf("La suma es: %d/%d.%nLa resta es %d/%d.%nEl producto es %d/%d.%nLa division es %d/%d%n%n"
        , numeradorSuma, denominadorSuma, numeradorResta, denominadorResta,
        numeradorProducto, denominadorProducto, numeradorDivision, denominadorDivision);
    
    paquete2.Fraccion sumaSimplificada = new paquete2.Fraccion(numeradorSuma, denominadorSuma).simplifica();
    paquete2.Fraccion restaSimplificada = new paquete2.Fraccion(numeradorResta, denominadorResta).simplifica();
    paquete2.Fraccion productoSimplificada = new paquete2.Fraccion(numeradorProducto, denominadorProducto).simplifica();
    paquete2.Fraccion divisionSimplificada = new paquete2.Fraccion(numeradorDivision, denominadorDivision).simplifica();
    
    System.out.printf("La suma simplificada es: %d/%d.%nLa resta simplificada es %d/%d.%nEl producto simplificado es %d/%d.%nLa division simplificada es %d/%d"
        , sumaSimplificada.getNum(), sumaSimplificada.getDen(), restaSimplificada.getNum(), restaSimplificada.getDen(),
        productoSimplificada.getNum(), productoSimplificada.getDen(), divisionSimplificada.getNum(), divisionSimplificada.getDen()); 
  }
}
