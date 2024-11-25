package prog.unidad04.actividad402.ejercicio01;

public class Pizza {
  
  private static final String PEDIDA = "pedida";
  private static final String SERVIDA = "servida";
  private static final String MEDIANA = "mediana";
  private static final String FAMILIAR = "familiar";
  private static final String MARGARITA = "margarita";
  private static final String CUATRO_QUESOS = "cuatro quesos";
  private static final String FUNGHI = "funghi";
  
  private String tamanio;
  private String tipo;
  private String estado;
  private static int pizzasServidas;
  private static int pizzasCreadas;
  
  public Pizza(String tamanio, String tipo) {
    
    if (tamanio.equalsIgnoreCase(MEDIANA) || tamanio.equalsIgnoreCase(FAMILIAR) && tipo.equalsIgnoreCase(MARGARITA) || tipo.equalsIgnoreCase(CUATRO_QUESOS) || tipo.equalsIgnoreCase(FUNGHI)) {
      
      pizzasCreadas++;
      this.tamanio = tamanio;
      this.tipo = tipo;
      this.estado = PEDIDA;
      
    }else if (tamanio.equalsIgnoreCase(MEDIANA) || tamanio.equalsIgnoreCase(FAMILIAR)) {
      
      System.out.printf("El parametro tipo no es correcto. Debe ser uno de %s, %s o %s%n", MARGARITA, CUATRO_QUESOS, FUNGHI);
    
    }else
     
      System.out.printf("El parametro tamanio no es correcto. Debe ser uno de %s o %s%n", MEDIANA, FAMILIAR);
  
  }
  
  public void servir() {
   
    if (estado == PEDIDA) {
      
      estado = SERVIDA;
      pizzasServidas++;
      
    }else {
      
      System.out.println("Error. esta pizza ya se ha servido");
      
    }
  }
  
  public String getTipo() {
    
    return tipo;
    
  }
  
  public String getTamanio() {
    
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
    
    return "Tamaño: " + getTamanio() + "Tipo: " + getTipo() + "Estado: " + getEstado();
    
  }
}