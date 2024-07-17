package Strings;

import java.util.Scanner;

/*
1. Crear un programa en el que hay que introducir una contraseña y compruebe si es
igual a alguna de las 3 preestablecidas. Debe funcionar con las contraseñas
“qwer”, “asdf”, “password”. Comprobar si las contraseñas son correctas utilizando el método equals().
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        // Array para almacenar las contraseñas preestablecidas
        String[] contrasenas = {"qwer", "asdf", "password"};
        Scanner scanner = new Scanner(System.in);
        String input = "";
        boolean contrasenaCorrecta = false;

        // Bucle while para pedir la contraseña hasta que sea correcta
        while (!contrasenaCorrecta) {
            System.out.print("Introduce una contraseña: ");
            input = scanner.nextLine();

            // Comprobar si la contraseña introducida es igual a alguna de las preestablecidas
            for (String contrasena : contrasenas) {
                if (input.equals(contrasena)) {
                    contrasenaCorrecta = true;
                    System.out.println("¡Contraseña correcta!");
                    break;
                }
            }

            // Si no se ha encontrado ninguna coincidencia, mostrar mensaje de error
            if (!contrasenaCorrecta) {
                System.out.println("Contraseña incorrecta. Inténtalo de nuevo.");
            }
        }

        scanner.close();
    }
}
