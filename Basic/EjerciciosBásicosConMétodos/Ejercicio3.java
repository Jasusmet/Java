package EjerciciosBásicosConMétodos;

import java.util.Scanner;

/*
3. Realizar un método al que se le pasan dos parámetros ‘a’ y ‘n’. Debe calcular y
devolver a elevado a n veces haciendo uso de un bucle (a*a*a... n veces)
 */

public class Ejercicio3 {
    public static int calcularPotencia(int a, int n) {
        int resultado = 1;
        for (int i = 0; i < n; i++) {
            resultado *= a;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de a: ");
        int a = scanner.nextInt();

        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();

        int resultado = calcularPotencia(a, n);
        System.out.println("El resultado de " + a + " elevado a " + n + " es " + resultado);
    }
}
