package EjerciciosBásicosConMetodos;

import java.util.Scanner;

/*
2. Diseñar un método que muestre en pantalla el doble del valor de un número que se le pasa como parámetro.
El método no devolverá ningún valor (void), imprime el resultado directamente por pantalla.
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int number = scanner.nextInt();
        printDouble(number);
    }

    public static void printDouble(int number) {
        int doubleValue = number * 2;
        System.out.println("El doble de " + number + " es " + doubleValue);
    }
}
