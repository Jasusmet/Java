package Condiciones;

import java.util.Scanner;

/*
1. Estamos realizando un programa para valorar bares. Tenemos dos
valoraciones, de 0 a 5 con valores decimales. Una indica la calidad del
servicio y la otra la calidad de la comida. Imprime el texto según esta combinación de valoraciones:
 a. Si los dos valores están por encima de 3.5 -> Bar excelente
 b. Si sólo uno de los valores está por encima de 3.5 -> Bar bueno
 c. Si los dos valores están entre 2 y 3.5 -> Bar regular
 d. Si cualquiera de las dos es inferior a 2 -> Bar malo
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la valoración del servicio (0-5): ");
        double servicio = scanner.nextDouble();

        System.out.print("Introduce la valoración de la comida (0-5): ");
        double comida = scanner.nextDouble();

        String resultado = valorarBar(servicio, comida);

        System.out.println("El bar es " + resultado);
    }

    public static String valorarBar(double servicio, double comida) {
        if (servicio > 3.5 && comida > 3.5) {
            return "excelente";
        } else if ((servicio > 3.5 && comida <= 3.5) || (servicio <= 3.5 && comida > 3.5)) {
            return "bueno";
        } else if (servicio >= 2 && servicio <= 3.5 && comida >= 2 && comida <= 3.5) {
            return "regular";
        } else {
            return "malo";
        }
    }
}
