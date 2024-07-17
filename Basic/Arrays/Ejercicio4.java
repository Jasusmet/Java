package Arrays;

import java.util.Scanner;

/*
 4. Crea un array de tamaño a un número que el usuario introduzca por teclado
 a. Pide al usuario tantos números como tamaño tenga el array y rellena el array con esos números que vaya introduciendo.
 b. Imprime los valores en una misma línea, separados por comas o espacios, menos
 los números que están en la primera y última posición, que deben imprimirse aparte.
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el tamaño del array
        System.out.print("Introduce el tamaño del array: ");
        int tamaño = scanner.nextInt();

        // Crear array de tamaño dinámico
        int[] array = new int[tamaño];

        // Rellenar el array con números introducidos por el usuario
        System.out.println("Introduce " + tamaño + " números:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        // Imprimir los valores en una misma línea, separados por comas o espacios
        System.out.print("Elementos del array (excepto primera y última posición): ");
        for (int i = 1; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Imprimir la primera y última posición aparte
        System.out.println("Primera posición: " + array[0]);
        System.out.println("Última posición: " + array[array.length - 1]);
    }
}
