package EjerciciosBásicosConMétodos;

import java.util.Scanner;

/*
2. Crea una aplicación que nos convierta una cantidad de euros introducida por
teclado a otra moneda, estas pueden ser a dólares, yenes o libras.
El método tendrá como parámetros, la cantidad de euros y la moneda a la que se va a
convertir (‘l’ a libras, ‘d’ a dólares, ‘y’ a yenes).
El método no devolverá ningún valor (void), si no que mostrará un mensaje indicando el cambio. El cambio de divisas son:
    0.86 libras es un 1 €
    1.28611 $ es un 1 €
    129.852 yenes es un 1 €
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la cantidad de euros: ");
        double euros = scanner.nextDouble();

        System.out.print("Introduce la moneda a convertir (l para libras, d para dólares, y para yenes): ");
        char moneda = scanner.next().charAt(0);

        convertirMoneda(euros, moneda);
    }

    public static void convertirMoneda(double euros, char moneda) {
        double cambio = 0;

        switch (moneda) {
            case 'l':
                cambio = euros * 0.86;
                System.out.printf("%.2f euros son %.2f libras%n", euros, cambio);
                break;
            case 'd':
                cambio = euros * 1.28611;
                System.out.printf("%.2f euros son %.2f dólares%n", euros, cambio);
                break;
            case 'y':
                cambio = euros * 129.852;
                System.out.printf("%.2f euros son %.2f yenes%n", euros, cambio);
                break;
            default:
                System.out.println("Moneda no válida");
        }
    }
}
