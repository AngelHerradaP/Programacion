
public class Ejercicio4 {
  public static void main(String[] args) {
    
    Persona persona1 = new Persona ();
    Persona persona2 = persona1;
    
    persona1.edad = 33;
    persona1.peso = 80.43;
    persona1.numeroHijos = 1;
    
    persona2.peso = 79.65;
    
    boolean dondeApuntanVariables = persona1 == persona2;
    
    System.out.printf("La persona tiene %d años, %d hijos y pesa %f kilos.%n", persona1.edad, persona1.numeroHijos, persona1.peso); 
    System.out.printf("¿Las variables persona1 y persona2 apuntan al mismo objeto? %b", dondeApuntanVariables);
    
  }
 }