package prog.unidad04.actividad402.ejercicio08;

public class IntervaloTiempo {

  //Constantes
  //Cantidad de segundos por minuto
  private static final int SEGUNDOS_POR_MINUTO = 60;
  
  //Atributos
  //Horas
  private int horas;
  //Minutos
  private int minutos;
  //Segundos
  private int segundos;
  
  //Constructores
  public IntervaloTiempo(int horas, int minutos, int segundos) {
    //Ajustamos segundos
    while (segundos > 59) {
      segundos -= 60;
      minutos++;
    }
    //Ajustamos minutos por el metodo manolo
    horas += minutos/60;
    minutos = minutos % 60;
    
    this.horas = horas;
    this.minutos = minutos;
    this.segundos = segundos;
  }
  
  public IntervaloTiempo suma(IntervaloTiempo otro) {
    //Sumamos segundos
    int segundosTemporales = segundos + otro.segundos;
    //Ajustamos los segundos
    int segundosReales = segundosTemporales % SEGUNDOS_POR_MINUTO;
    //Calculamos lo minutos extra
    int minutosExtra = segundosTemporales / SEGUNDOS_POR_MINUTO;
    
    //Hacemos lo mismo con los minutos
    int minutosTemporales = minutos + otro.minutos + minutosExtra;
    int minutosReales = minutosTemporales % SEGUNDOS_POR_MINUTO;
    int horasExtra = minutosTemporales / SEGUNDOS_POR_MINUTO;
    
    //Por último calculamos las horas
    int horasReales  = horas + otro.horas + horasExtra;
    
    //Creamos el resultado
    IntervaloTiempo resultado = new IntervaloTiempo(horasReales, minutosReales, segundosReales);
    return resultado;
  }
  
  public IntervaloTiempo resta(IntervaloTiempo otro) {
      int horasReales = horas - otro.horas;
      
      int minutosReales = minutos;
      
      int segundosReales = segundos - otro.segundos;
      
      if (segundosReales < 0) {
       segundosReales = SEGUNDOS_POR_MINUTO + segundosReales;
       minutosReales--;
      }
      
      minutosReales = minutosReales - otro.minutos;
      
      if (minutosReales < 0) {
        minutosReales = SEGUNDOS_POR_MINUTO + minutosReales;
        horasReales--;
       }
      
    if (horasReales < 0) {
      System.out.println("No se puede realizar la resta");
      return null;
    }
    
    IntervaloTiempo resultado = new IntervaloTiempo(horasReales, minutosReales, segundosReales);
    return resultado;
  }
  
  public String obtenerCadena() {
    return horas + "h " + minutos + "m " + segundos + "s";
  }
  
}
