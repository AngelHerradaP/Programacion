public class Ejercicio3 {
  public static void main(String[] args) {
    
    Persona persona1 = new Persona ();
    Persona persona2 = persona1;
    
    persona1.edad = 33;
    persona1.peso = 80.43;
    persona1.numeroHijos = 2;
    
    persona2.peso = 79.65;
    
    System.out.printf("La persona tiene %d años, %d hijos y pesa %f kilos.%n", persona1.edad, persona1.numeroHijos, persona1.peso);
    
  }
 }