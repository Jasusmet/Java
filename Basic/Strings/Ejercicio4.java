package Strings;

import java.util.Scanner;

/*
4. Programa en el que el usuario introduce su nombre y su país. Imprimir su nombre
seguido de un guión y las dos primeras letras del país en mayúscula (código del
país)
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce tu país: ");
        String pais = scanner.nextLine();

        String codigoPais = pais.substring(0, 2).toUpperCase();

        System.out.println(nombre + " - " + codigoPais);
    }
}
