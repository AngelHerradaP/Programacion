import java.util.Locale;
import java.util.Scanner;

public class CalculoNotaFinal {
  public static final double PORCENTAJE_PROMEDIO_CALIFICACIONES = 0.55;
  public static final double PORCENTAJE_CALIFICACION_EXAMEN = 0.30;
  public static final double PORCENTAJE_CALIFICAION_TRABAJO = 0.15;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduzca la nota de la unidad 1: ");
    double calificacionUnidad1 = Double.parseDouble(sc.nextLine());
    
    System.out.print("Introduzca la nota de la unidad 2: ");
    double calificacionUnidad2 = Double.parseDouble(sc.nextLine()); 
    
    System.out.print("Introduzca la nota de la unidad 3: ");
    double calificacionUnidad3 = Double.parseDouble(sc.nextLine()); 
    
    System.out.print("Introduzca la nota del examen final del trimestre: ");
    double calificacionExamen = Double.parseDouble(sc.nextLine());
    
    System.out.print("Introduzca la nota del trabajo expuesto en clase: ");
    double calificacionTrabajo = Double.parseDouble(sc.nextLine());
    
    double promedioCalificacion = (calificacionUnidad1 + calificacionUnidad2 + calificacionUnidad3) /3 ; 
    double resultadoClasificacionExamen = calificacionExamen * PORCENTAJE_CALIFICACION_EXAMEN;
    double resultadoPromedioCalificacion = promedioCalificacion * PORCENTAJE_PROMEDIO_CALIFICACIONES;
    double resultadoCalificacionTrabajo = calificacionTrabajo * PORCENTAJE_CALIFICAION_TRABAJO;
    double notaEvaluacion = resultadoCalificacionTrabajo + resultadoClasificacionExamen + resultadoPromedioCalificacion;
    
    System.out.printf(Locale.US, "La nota de la evaluacion es de %f", notaEvaluacion);
  }
}