
public class Actividad203c {

  public static void main(String[] args) {
    
    Lapiz lapiz = new Lapiz();
    
    lapiz.baja();
    
    lapiz.desplaza(20);
    lapiz.gira(-90);
    lapiz.desplaza(20);
    lapiz.gira(-90);
    lapiz.desplaza(20);
    lapiz.gira(-90);
    lapiz.desplaza(20);
    
    lapiz.reinicia();
    
    Punto punto = new Punto(20, 35);
    
    lapiz.mueve(punto);
    lapiz.baja();
    
    lapiz.desplaza(30);
    lapiz.gira(120);
    lapiz.desplaza(30);
    lapiz.gira(120);
    lapiz.desplaza(30);
    
    lapiz.reinicia();
    
    punto.setX(25);
    punto.setY(55);
    lapiz.mueve(punto);
    lapiz.baja();
    
    lapiz.desplaza(20);
    lapiz.gira(72);
    lapiz.desplaza(20);
    lapiz.gira(72);
    lapiz.desplaza(20);
    lapiz.gira(72);
    lapiz.desplaza(20);
    lapiz.gira(72);
    lapiz.desplaza(20);
    
    lapiz.reinicia();
    
  }
}
