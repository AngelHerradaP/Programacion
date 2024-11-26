package prog.unidad04.actividad402.ejercicio02;

public class Pizza {
  
  public static final String ESTADO_PEDIDA = "pedida";
  public static final String ESTADO_SERVIDA = "servida";
  public static final String TAMANYO_MEDIANA = "mediana";
  public static final String TAMANYO_FAMILIAR = "familiar";
  public static final String TIPO_MARGARITA = "margarita";
  public static final String TIPO_CUATRO_QUESOS = "cuatro quesos";
  public static final String TIPO_FUNGHI = "funghi";
  private static final double COSTE_TAMANYIO_MEDIANA = 5;
  private static final double COSTE_TAMANYIO_FAMILIAR = 7.5;
  private static final double COSTE_POR_INGREDIENTE = 1;
  private String tamanyo;
  private String tipo;
  private String estado;
  private double coste;
  private static int pizzasServidas;
  private static int pizzasCreadas;
  
  public Pizza(String tamanyo, String tipo) {
    
    tamanyo.toLowerCase();
    tipo.toLowerCase();
    
    if (tamanyo.equals(TAMANYO_MEDIANA) || tamanyo.equals(TAMANYO_FAMILIAR) && tipo.equals(TIPO_MARGARITA) || tipo.equals(TIPO_CUATRO_QUESOS) || tipo.equals(TIPO_FUNGHI)) {
      
      pizzasCreadas++;
      this.tamanyo = tamanyo;
      this.tipo = tipo;
      this.estado = ESTADO_PEDIDA;
      
    }else if (tamanyo.equals(TAMANYO_MEDIANA) || tamanyo.equals(TAMANYO_FAMILIAR)) {
      
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
    
    return tamanyo;
    
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
    
    return "Tamaño: " + getTamanyo() + "Tipo: " + getTipo() + "Estado: " + getEstado() + "Coste: " + coste();
    
  }
  
  public double coste() {
    
    double calculoCoste = 0;
    
    switch (tipo) {
    case TIPO_MARGARITA: {
      
      calculoCoste= COSTE_POR_INGREDIENTE * 2;
      
    }
    case TIPO_FUNGHI: {
      
      calculoCoste= COSTE_POR_INGREDIENTE * 3;
      
    }
    case TIPO_CUATRO_QUESOS: {
      
      calculoCoste= COSTE_POR_INGREDIENTE * 4;
      
    }
    }
    
    switch (tamanyo) {
    case TAMANYO_MEDIANA: {
      
      calculoCoste+= COSTE_TAMANYIO_MEDIANA;
      
    }
    case TAMANYO_FAMILIAR: {
      
      calculoCoste+= COSTE_TAMANYIO_FAMILIAR;
      
    }
    }
    
    return coste = calculoCoste;
    
  }
} 