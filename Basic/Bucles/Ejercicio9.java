package Bucles;

import java.util.Scanner;

/*
9. Programa en el que se pidan números hasta que se introduzca uno negativo,
y calcular la media.
 */

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sum = 0.0;

        while (true) {
            System.out.print("Escribe un número (negativo para finalizar el programa): ");
            double num = scanner.nextDouble();

            if (num < 0) {
                break;
            }

            sum += num;
            count++;
        }

        if (count == 0) {
            System.out.println("No se han ingresado números.");
        } else {
            double average = sum / count;
            System.out.println("La media de los números es: " + average);
        }
    }
}
