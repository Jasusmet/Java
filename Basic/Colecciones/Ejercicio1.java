package Colecciones;

import java.util.ArrayList;
import java.util.Scanner;

/*
1. Programa que calculará la suma y la media aritmética de los elementos de un ArrayList.
Se leerá una serie de valores numéricos enteros desde el teclado. Se guardan en un
ArrayList de tipo Integer. Se pedirán la cantidad de números que desees, se puede
preguntar al usuario cuántos va a escribir, o pedirle números hasta que introduzca
un cero.
A continuación, el programa mostrará por pantalla la suma y la media de todos los
valores.
Por último se imprimirán todos los valores del ArrayList, indicando cuántos de ellos
son mayores que la media.
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.print("¿Cuántos números deseas introducir? (o introduce 0 para finalizar): ");
        int cantidad = scanner.nextInt();

        while (cantidad != 0) {
            for (int i = 0; i < cantidad; i++) {
                System.out.print("Introduce un número: ");
                int numero = scanner.nextInt();
                numeros.add(numero);
            }
            System.out.print("¿Quieres introducir más números? (o introduce 0 para finalizar): ");
            cantidad = scanner.nextInt();
        }

        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }

        double media = (double) suma / numeros.size();

        System.out.println("La suma de los números es: " + suma);
        System.out.println("La media de los números es: " + media);

        int countMayoresQueMedia = 0;
        for (int numero : numeros) {
            if (numero > media) {
                countMayoresQueMedia++;
            }
        }

        System.out.println("Los números del ArrayList son:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println("\nHay " + countMayoresQueMedia + " números mayores que la media.");
    }
}