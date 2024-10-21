import es.iespablopicasso.programacion.unidad02.actividad0201.GranHermano;

public class Actividad204a {

    public static void main(String[] args) {
     
      new GranHermano(34);   
     
      int numeroObjetos1 = GranHermano.getNumeroObjetosCreados();
     
      System.out.printf("La cantidad de objetos creados es de: %d%n", numeroObjetos1);

      new GranHermano(35);
      
      int numeroObjetos2 = GranHermano.getNumeroObjetosCreados();
     
      System.out.printf("La cantidad de objetos creados es de: %d", numeroObjetos2);
     
    }
}
