package Strings;

import java.util.Scanner;

/*
2. Crear un programa donde el usuario tendrá que introducir su nueva contraseña. La
contraseña sólo puede tener un tamaño de 8 caracteres. Leer la contraseña por
teclado e indicar si la contraseña introducida es válida.
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nueva contraseña: ");
        String contraseña = scanner.next();

        if (contraseña.length() == 8) {
            System.out.println("La contraseña introducida es válida.");
        } else {
            System.out.println("La contraseña debe tener exactamente 8 caracteres.");
        }
    }
}