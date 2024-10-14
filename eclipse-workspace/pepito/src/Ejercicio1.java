
public class Ejercicio1 {
  public static void main(String[] args) {
    
    Persona persona1 = new Persona ();
    Persona persona2 = new Persona ();
    persona1.edad = 25;
    persona1.peso = 75.4;
    persona1.numeroHijos = 0;
    persona2.edad = 65;
    persona2.peso = 65;
    persona2.numeroHijos = 3;
    
    System.out.printf("La primera persona tiene %d años, %d hijos y pesa %f kilos.%n", persona1.edad, persona1.numeroHijos, persona1.peso);
    System.out.printf("La segunda persona tiene %d años, %d hijos y pesa %f kilos.", persona2.edad, persona2.numeroHijos, persona2.peso);
    
    
  }
 }
