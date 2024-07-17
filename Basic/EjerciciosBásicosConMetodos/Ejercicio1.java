package EjerciciosBásicosConMetodos;

import java.util.Scanner;

/*
 1. Realizar un método, al que se le pasa como parámetro un número N. El método no
devolverá ningún valor (void), si no que mostrará por pantalla N veces, el mensaje:
“Módulo ejecutándose”
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de veces que quieres que se ejecute: ");
        int N = scanner.nextInt();
        executeNTimes(N);
    }

    public static void executeNTimes(int N) {
        for (int i = 0; i < N; i++) {
            System.out.println("Módulo ejecutándose");
        }
    }
}
