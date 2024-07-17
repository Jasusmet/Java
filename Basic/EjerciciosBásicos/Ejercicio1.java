package EjerciciosBásicos;

/* 1. Crear dos variables numéricas de tipo entero. Realizar estas operaciones en este orden:
 a. Dar un valor a la primera
 b. Le damos a la segunda el valor de la primera
 c. Imprimir por pantalla las dos variables
 d. Cambiar el valor de la segunda variable y volver a imprimir las variables por pantalla */

public class Ejercicio1 {
    public static void main(String[] args) {
        int variable1 = 10; // a. Dar un valor a la primera
        int variable2 = variable1; // b. Le damos a la segunda el valor

        System.out.println("Variable 1: " + variable1); // c. Imprimir por pantalla las dos variables
        System.out.println("Variable 2: " + variable2);

        variable2 = 20; // d. Cambiar el valor de la segunda variable
        System.out.println("Variable 1: " + variable1); // Volver a imprimir las variables por pantalla
        System.out.println("Variable 2: " + variable2);
    }
}
