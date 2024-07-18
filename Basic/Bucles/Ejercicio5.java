package Bucles;

import java.util.Scanner;

/*
5. Crea un programa que pida al usuario dos números enteros y muestre su suma. Se
repetirá hasta que los dos sean 0. Emplea do-while.
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        do {
            System.out.print("Escribe el primer número: ");
            num1 = scanner.nextInt();

            System.out.print("Escribe el segundo número: ");
            num2 = scanner.nextInt();

            int sum = num1 + num2;
            System.out.println("La suma da como resultado: " + sum);
        } while (num1 != 0 && num2 != 0);
    }
}
