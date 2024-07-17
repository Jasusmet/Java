package EjerciciosBásicos;

/*
 2. Dadas dos variables numéricas A y B con los valores que elijas, realizar un
programa para intercambiar los valores de ambas variables y muestre su
valor por pantalla
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        int A = 5;
        int B = 10;

        System.out.println("Valor inicial de A: " + A);
        System.out.println("Valor inicial de B: " + B);

        // Intercambiar los valores de A y B
        int temp = A;
        A = B;
        B = temp;

        System.out.println("Valor final de A: " + A);
        System.out.println("Valor final de B: " + B);
    }
}
