package Bucles;

import java.util.Scanner;

/*
7. Programa donde se piden números hasta que se teclee uno negativo, y
mostrar cuántos números se han introducido.
 */

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (true) {
            System.out.print("Escribe un número: ");
            int num = scanner.nextInt();

            if (num < 0) {
                break;
            }

            count++;
        }

        System.out.println("Has escrito " + count + " números.");
    }
}
