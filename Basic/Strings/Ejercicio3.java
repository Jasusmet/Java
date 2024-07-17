package Strings;

import java.util.Scanner;

/*
3. Queremos crear un programa que nos ayude a crear buenas rimas para nuestros
poemas. Para ello, tienen que coincidir las 3 últimas letras de la frase anterior. El
programa tiene que pedir un texto, que será la última línea del poema. Después,
introducimos una palabra, que es la que queremos que compruebe si rima. El
programa tendrá que indicar si las 3 últimas letras de la palabra son iguales que las
3 últimas letras de la frase.
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la última línea del poema:");
        String ultimaLinea = scanner.nextLine();

        System.out.println("Introduce una palabra para comprobar si rima:");
        String palabra = scanner.nextLine();

        if (rima(ultimaLinea, palabra)) {
            System.out.println("¡La palabra rima con la última línea del poema!");
        } else {
            System.out.println("La palabra no rima con la última línea del poema.");
        }
    }

    public static boolean rima(String ultimaLinea, String palabra) {
        // Obtener las 3 últimas letras de la última línea del poema
        String ultimasLetrasUltimaLinea = ultimaLinea.substring(ultimaLinea.length() - 3);

        // Obtener las 3 últimas letras de la palabra
        String ultimasLetrasPalabra = palabra.substring(palabra.length() - 3);

        // Comprobar si las 3 últimas letras coinciden
        return ultimasLetrasUltimaLinea.equalsIgnoreCase(ultimasLetrasPalabra);
    }
}
