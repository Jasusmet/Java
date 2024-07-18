package Bucles;

import java.util.Scanner;

/*
6. Programa que pida 5 números e indicar si alguno es múltiplo de 3.
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isMultipleOfThree = false;

        for (int i = 0; i < 5; i++) {
            System.out.print("Escribe cinco números " + (i + 1) + ": ");
            int num = scanner.nextInt();

            if (num % 3 == 0) {
                isMultipleOfThree = true;
                System.out.println(num + " es múltiplo de 3");
            }
        }

        if (!isMultipleOfThree) {
            System.out.println("Ninguno de los números es múltiplo de 3");
        }
    }
}
