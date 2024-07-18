package Bucles;

import java.util.Scanner;

/*
8. Programa en el que se pidan números hasta que se teclee un 0. Una vez
introducido el 0, mostrar la suma de todos los números introducidos.
 */

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Escribe un número (0 para finalizar el programa): ");
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }

            sum += num;
        }

        System.out.println("La suma de los números es: " + sum);
    }
}