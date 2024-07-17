package Strings;

import java.util.Scanner;

/*
5. Programa en el que el usuario escribe la url de una página web. Realizar las
siguientes comprobaciones:
- Si la url empieza por https:// -> está en el formato correcto
- Si la url empieza por http:// -> lo eliminamos, le añadimos delante https:// e
imprimimos el resultado
- Si no se cumple ninguno de los casos anteriores, añadimos delante https:// e
imprimimos el resultado.
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la URL de la página web: ");
        String url = scanner.nextLine();

        if (url.startsWith("https://")) {
            System.out.println("La URL está en el formato correcto: " + url);
        } else if (url.startsWith("http://")) {
            url = url.replace("http://", "https://");
            System.out.println("La URL ha sido convertida a HTTPS: " + url);
        } else {
            url = "https://" + url;
            System.out.println("La URL ha sido convertida a HTTPS: " + url);
        }
    }
}
