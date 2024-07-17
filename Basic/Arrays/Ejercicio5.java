package Arrays;

/*
5. Leer 10 números enteros. Después, leer un número N y buscarlo en la tabla. Imprimir en
qué posición del array se encuentra. Si no está, indicarlo con un mensaje.
 */

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer 10 números enteros
        int[] array = new int[10];
        System.out.println("Introduce 10 números enteros:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        // Leer un número N
        System.out.print("Introduce un número N: ");
        int n = scanner.nextInt();

        // Buscar el número N en la tabla
        boolean encontrado = false;
        int posicion = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                encontrado = true;
                posicion = i + 1; // +1 porque la posición es 1-based, no 0-based
                break;
            }
        }

        // Imprimir el resultado
        if (encontrado) {
            System.out.println("El número " + n + " se encuentra en la posición " + posicion);
        } else {
            System.out.println("El número " + n + " no se encuentra en la tabla");
        }
    }
}
