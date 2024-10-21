package prog.unidad03.seleccion;

import java.util.Locale;
import java.util.Scanner;
public class CalculaIMCApp {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce tu peso (en kg): ");
    double peso = Double.parseDouble(sc.nextLine());
    System.out.println("Introduce tu altura (en metros): ");
    double altura = Double.parseDouble(sc.nextLine());
    
    double imc = peso / (altura*altura);
    String resultadoIMC = "Pon un numero valido";
    
    if (imc < 16) {
      
      System.out.println("Ingreso en hosspital por infrapeso");
      
    }else if (imc < 17) {
      
      resultadoIMC = "Infrapeso";
      
    }else if (imc < 18) {
      
      resultadoIMC = "Bajo peso";
      
    }else if (imc < 25) {

      resultadoIMC = "Peso normal (saludable)";
      
    }else if (imc < 30) {
      
      resultadoIMC = "Sobrepeso (obesidad de grado 1)";
      
    }else if (imc < 35) {
      
      resultadoIMC = "Sobrepeso cronico (obesidad de grado 2)";
      
    }else if (imc <= 40) {
      
      resultadoIMC = "Obesidad premorbida (obesidad de grado 3)";
      
    }else if (imc > 40) {
      
      resultadoIMC = "Obesidad morbida (obesidad de grado 4)";
    }
    
    System.out.printf(Locale.US,"Su IMC es de %f, con un diagnostico de %s" , imc, resultadoIMC);
  }
}
