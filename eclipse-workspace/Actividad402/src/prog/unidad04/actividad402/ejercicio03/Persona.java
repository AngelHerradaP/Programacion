package prog.unidad04.actividad402.ejercicio03;

import java.util.Random;

public class Persona {

  private String nombre;
  private String dni;
  private char sexo;
  private int edad;
  private double peso;
  private double altura;
  
  public Persona() {
    
    nombre = "";
    sexo = 'M';
    
  }
  public Persona(String nombre, int edad, char sexo) {
    
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo;
    
  }
  public Persona(String nombre, int edad, char sexo, double peso, double altura) {
    
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo;
    this.peso = peso;
    this.altura = altura;
    
  }
  
  private String generarDNI() {
    
    Random numeroAleatorio = new Random();
    int numeroDni = numeroAleatorio.nextInt(10000000, 99999999);
    
    String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKE";
    char letraDni = letrasDni.charAt(numeroDni % letrasDni.length());
    
    return dni = "" + numeroDni + letraDni;
  }
  
  public boolean esMayorDeEdad() {
    
    boolean comprobacionMayorDeEdad = false;
    
    if (edad > 17) {
      
      comprobacionMayorDeEdad = true;
      
    }
    
    return comprobacionMayorDeEdad;
    
  }
  public double getIMC() {
    
    return peso / (altura * altura);
    
  }
  
  private char comprobarSexo(char sexo) {
    
    if (sexo == 'M' || sexo == 'H') {
      
      return sexo;
      
    }else {
      
      return sexo = 'M';
      
    }
  }
  
  public int getPesoCorrecto() {
    
    if (getIMC() < 20) {
      
      return -1;
      
    }else if (getIMC() > 25) {
      
      return 1;
      
    }else {
      
      return 0;
      
    }
    
  }
  
  public String toString() {
    
    return "Nombre: " + nombre + "Edad: " + edad + "Sexo: " + comprobarSexo(sexo) + "Peso: " + peso + "Altura: " + altura + "DNI: " + generarDNI();
    
  }
  
}
