package prog.unidad04.actividad402.ejercicio01;

public class Pizza {
  
  private static final String ESTADO_PEDIDA = "pedida";
  private static final String ESTADO_SERVIDA = "servida";
  private static final String TAMANYO_MEDIANA = "mediana";
  private static final String TAMANYO_FAMILIAR = "familiar";
  private static final String TIPO_MARGARITA = "margarita";
  private static final String TIPO_CUATRO_QUESOS = "cuatro quesos";
  private static final String TIPO_FUNGHI = "funghi";
  
  private String tamanio;
  private String tipo;
  private String estado;
  private static int pizzasServidas;
  private static int pizzasCreadas;
  
  public Pizza(String tamanio, String tipo) {
    
    if (tamanio.equalsIgnoreCase(TAMANYO_MEDIANA) || tamanio.equalsIgnoreCase(TAMANYO_FAMILIAR) && tipo.equalsIgnoreCase(TIPO_MARGARITA) || tipo.equalsIgnoreCase(TIPO_CUATRO_QUESOS) || tipo.equalsIgnoreCase(TIPO_FUNGHI)) {
      
      pizzasCreadas++;
      this.tamanio = tamanio;
      this.tipo = tipo;
      this.estado = ESTADO_PEDIDA;
      
    }else if (tamanio.equalsIgnoreCase(TAMANYO_MEDIANA) || tamanio.equalsIgnoreCase(TAMANYO_FAMILIAR)) {
      
      System.out.printf("El parametro tipo no es correcto. Debe ser uno de %s, %s o %s%n", TIPO_MARGARITA, TIPO_CUATRO_QUESOS, TIPO_FUNGHI);
    
    }else
     
      System.out.printf("El parametro tamanio no es correcto. Debe ser uno de %s o %s%n", TAMANYO_MEDIANA, TAMANYO_FAMILIAR);
  
  }
  
  public void sirve() {
   
    if (estado == ESTADO_PEDIDA) {
      
      estado = ESTADO_SERVIDA;
      pizzasServidas++;
      
    }else {
      
      System.out.println("Error. esta pizza ya se ha servido");
      
    }
  }
  
  public String getTipo() {
    
    return tipo;
    
  }
  
  public String getTamanyo() {
    
    return tamanio;
    
  }

  public String getEstado() {
  
  return estado;
  
  }
  
  public static int getPizzasCreadas() {
    
    return pizzasCreadas;
    
  }
  
  public static int getPizzasServidas() {
    
    return pizzasServidas;
    
  }
  
  public String toString() {
    
    return "Tamaño: " + getTamanyo() + "Tipo: " + getTipo() + "Estado: " + getEstado();
    
  }
} 