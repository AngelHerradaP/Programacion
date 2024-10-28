package prog.unidad03.repeticion;

public class CuadriculaDiezPorDiezApp {

  public static void main(String[] args) {
    
    int saltoDeLinea = 11;
    
    System.out.println("Numeros del 1 al 100");
    
    for (int i = 1; i <= 100; i++) {

      if (i == saltoDeLinea) {
        
        System.out.printf("%n%d\t", i);
        saltoDeLinea += 10;
        
      }else {
        
        System.out.printf("%d\t", i);
        
      }
    }    
  }  
}
