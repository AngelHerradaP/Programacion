package prog.unidad03.seleccion;

import java.util.Scanner;

public class NombreMesesMejoradaApp {

  public static void main(String[] args) { 
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce un numero entero del 1 al 12 y te dire que mes ocupa esa posicion: ");
    int numeroAnio = Integer.parseInt(sc.nextLine());
    
    if (numeroAnio >= 1 && numeroAnio <= 12) {
     
      String mesAnio = "";
      
      switch (numeroAnio) {
        case 1 : {
          
          mesAnio = "Enero";
          break;
          
        }
        case 2 : {
          
          mesAnio = "Febrero";
          break;
          
        }
        case 3 : {
          
          mesAnio = "Marzo";
          break;
          
        }
        case 4 : {
  
          mesAnio = "Abril";
          break;
        
        }
        case 5 : {
  
          mesAnio = "Mayo";
          break;
  
        }
        case 6 : {
  
          mesAnio = "Junio";
          break;
  
        }
        case 7 : {
  
          mesAnio = "Julio";
          break;
  
        }
        case 8 : {
  
          mesAnio = "Agosto";
          break;
  
        }
        case 9 : {
  
          mesAnio = "Septiembre";
          break;
  
        }
        case 10 : {
  
          mesAnio = "Octubre";
          break;
  
        }
        case 11 : {
  
          mesAnio = "Noviembre";
          break;
  
        }
        case 12 : {
  
          mesAnio = "Diciembre";
          break;
  
        }
      }
      System.out.printf("El mes con posicion %d tiene el nombre %s", numeroAnio, mesAnio);
      
    }else {
      
      System.out.println("Introduce un numero del 1 al 12. (Ambos incluidos)");
      
    }
    
  }
}
