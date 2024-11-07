public class SumaNumeros {

    public static void main(String[] args) {
        int n = 5; // Número hasta el cual se sumará
        int suma = calcularSuma(n);
        System.out.println("La suma de los primeros " + n + " números es: " + suma);
    }

    public static int calcularSuma(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i; // Agrega el valor de i a la suma
        }
        return suma;
    }
}