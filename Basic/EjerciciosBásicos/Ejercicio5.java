package EjerciciosBásicos;

/* 5. Escribe un programa para hacer lo siguiente:
 a. Declarar una variable P de tipo int, una variable A de tipo double y una variable C de tipo char
 b. Asignar a cada una un valor
 c. Después, mostrar por pantalla:
    i.      El valor de cada variable
    ii.     La suma de P + A
    iii.    La diferencia de A - P
*/

public class Ejercicio5 {
    public static void main(String[] args) {
        // Declarar variables
        int P = 10;
        double A = 20.5;
        char C = 'A';

        // Mostrar valores de cada variable
        System.out.println("Valor de P: " + P);
        System.out.println("Valor de A: " + A);
        System.out.println("Valor de C: " + C);

        // Operaciones
        System.out.println("Suma de P + A: " + (P + A));
        System.out.println("Diferencia de A - P: " + (A - P));
    }
}
