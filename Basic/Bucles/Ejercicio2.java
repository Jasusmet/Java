package Bucles;

import java.util.Scanner;

/*
2. Crea un programa que escriba en pantalla tantos asteriscos como el usuario indique,
todos ellos en la misma línea.
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe el número de asteriscos que quieres que aparezcan por pantalla: ");
        int numAsterisks = scanner.nextInt();

        for (int i = 0; i < numAsterisks; i++) {
            System.out.print("*");
        }
    }
}
