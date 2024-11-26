package prog.unidad04.actividad402.ejercicio03;

import java.util.Random;

public class Persona {

  private static final char SEXO_HOMBRE = 'H';
  private static final char SEXO_MUJER = 'M';
  private static final int LIMITE_SUPERIOR_IMC = 25;
  private static final int LIMITE_INFERIOR_IMC = 20;
  private static final int LIMITE_SUPERIOR_DNI = 99999999;
  private static final int LIMITE_INFERIOR_DNI = 10000000;
  private static final int MAYORIA_DE_EDAD = 18;
  
  private String nombre;
  private String dni;
  private char sexo;
  private int edad;
  private double peso;
  private double altura;
  
  public Persona() {
    
    nombre = "";
    sexo = 'M';
    dni = generarDNI();
    
  }
  
  public Persona(String nombre, int edad, char sexo) {
    
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = comprobarSexo(sexo);
    dni = generarDNI();
    
  }
  
  public Persona(String nombre, int edad, char sexo, double peso, double altura) {
    
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = comprobarSexo(sexo);
    this.peso = peso;
    this.altura = altura;
    dni = generarDNI();
    
  }
  
  private String generarDNI() {
   
	Random numeroAleatorio = new Random();
	int numeroDni = numeroAleatorio.nextInt(LIMITE_INFERIOR_DNI, LIMITE_SUPERIOR_DNI);
	
	String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKE";
	char letraDni = letrasDni.charAt(numeroDni % letrasDni.length());
	
	return dni = "" + numeroDni + letraDni;
	
  }
  
  public boolean esMayorDeEdad() {
    
    boolean comprobacionMayorDeEdad = false;
    
    if (edad > MAYORIA_DE_EDAD) {
      
      comprobacionMayorDeEdad = true;
      
    }
    
    return comprobacionMayorDeEdad;
    
  }
  
  public double getIMC() {
    
    return peso / (altura * altura);
    
  }
  
  private char comprobarSexo(char sexo) {
    
    if (sexo == SEXO_MUJER || sexo == SEXO_HOMBRE) {
      
      return sexo;
      
    }else {
      
      return sexo = SEXO_MUJER;
      
    }
  }
  
  public int getPesoCorrecto() {
    
    if (getIMC() < LIMITE_INFERIOR_IMC) {
      
      return -1;
      
    }else if (getIMC() > LIMITE_SUPERIOR_IMC) {
      
      return 1;
      
    }else {
      
      return 0;
      
    }
    
  }
  
  public String toString() {
    
    return "Nombre: " + nombre + "Edad: " + edad + "Sexo: " + sexo + "Peso: " + peso + "Altura: " + altura + "DNI: " + dni;
    
  }
  
}
