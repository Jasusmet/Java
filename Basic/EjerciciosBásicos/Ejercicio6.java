package EjerciciosBásicos;

/*
6. Escribe un programa que haga lo siguiente:
 a. Declarar dos variables X e Y de tipo int
 b. Dos variables N y M de tipo double
 c. Asigna a cada una un valor
 d. A continuación muestra por pantalla:
    i.      El valor de cada variable
    ii.     La suma X + Y
    iii.    La diferencia x - Y
    iv.     El producto X * Y
    v.      El cociente X / Y
    vi.     El resto X % Y
    vii.    La suma N + M
    viii.   La diferencia N – M
    ix.     El producto N * M
    x.      El cociente N / M
    xi.     El resto N % M
    xii.    La suma X + N
    xiii.   El cociente Y / M
    xiv.    El resto Y % M
    xv.     El doble de cada variable
    xvi.    La suma de todas las variables
    xvii.   El producto de todas las variables
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        // Declarar variables
        int X = 5;
        int Y = 3;
        double N = 10.2;
        double M = 2.5;

        // Mostrar valores de cada variable
        System.out.println("Valor de X: " + X);
        System.out.println("Valor de Y: " + Y);
        System.out.println("Valor de N: " + N);
        System.out.println("Valor de M: " + M);

        // Operaciones
        System.out.println("Suma de X + Y: " + (X + Y));
        System.out.println("Diferencia de X - Y: " + (X - Y));
        System.out.println("Producto de X * Y: " + (X * Y));
        System.out.println("Cociente de X / Y: " + (X / Y));
        System.out.println("Resto de X % Y: " + (X % Y));

        System.out.println("Suma de N + M: " + (N + M));
        System.out.println("Diferencia de N - M: " + (N - M));
        System.out.println("Producto de N * M: " + (N * M));
        System.out.println("Cociente de N / M: " + (N / M));
        System.out.println("Resto de N % M: " + (N % M));

        System.out.println("Suma de X + N: " + (X + N));
        System.out.println("Cociente de Y / M: " + (Y / M));
        System.out.println("Resto de Y % M: " + (Y % M));

        // Doble de cada variable
        System.out.println("Doble de X: " + (X * 2));
        System.out.println("Doble de Y: " + (Y * 2));
        System.out.println("Doble de N: " + (N * 2));
        System.out.println("Doble de M: " + (M * 2));

        // Suma de todas las variables
        System.out.println("Suma de todas las variables: " + (X + Y + N + M));

        // Producto de todas las variables
        System.out.println("Producto de todas las variables: " + (X * Y * N * M));
    }
}
