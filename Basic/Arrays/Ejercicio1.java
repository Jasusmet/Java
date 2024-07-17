package Arrays;

/* 1. Crea un array de números enteros con un tamaño de 10 elementos.
 a. Asigna valor a las posiciones 1, 4, 9 y 10
 b. Imprime los valores de las posiciones 4, 1, 8 y 10
 c. Imprime el tamaño total que tiene el array
 d. Imprime todos los elementos del array en una misma línea separados por comas o espacios
 e. Imprime únicamente los 6 primeros elementos
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        // Crea un array de números enteros con un tamaño de 10 elementos
        int[] array = new int[10];

        // a. Asigna valor a las posiciones 1, 4, 9 y 10
        array[1] = 10;
        array[4] = 20;
        array[9] = 30;
        array[10 - 1] = 40; // recordar que los índices comienzan en 0

        // b. Imprime los valores de las posiciones 4, 1, 8 y 10
        System.out.println("Valores de las posiciones 4, 1, 8 y 10:");
        System.out.println(array[4] + ", " + array[1] + ", " + array[8] + ", " + array[9]);

        // c. Imprime el tamaño total que tiene el array
        System.out.println("Tamaño del array: " + array.length);

        // d. Imprime todos los elementos del array en una misma línea separados por comas
        System.out.print("Todos los elementos del array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // e. Imprime únicamente los 6 primeros elementos
        System.out.print("Los 6 primeros elementos del array: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
