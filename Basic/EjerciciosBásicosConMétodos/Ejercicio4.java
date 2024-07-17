package EjerciciosBásicosConMétodos;

import java.util.Scanner;

/*
4. Crear 4 métodos que recibirán 2 números decimales como parámetros. Cada
método realizará una operación: sumar, restar, multiplicar o dividir. Cada
método devolverá (return) el resultado.
 */

public class Ejercicio4 {
    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el valor de b: ");
        double b = scanner.nextDouble();

        System.out.println("Seleccione la operación que desea realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.print("Ingrese la opción (1-4): ");
        int opcion = scanner.nextInt();

        double resultado = 0;

        switch (opcion) {
            case 1:
                resultado = sumar(a, b);
                System.out.println("La suma de " + a + " y " + b + " es: " + resultado);
                break;
            case 2:
                resultado = restar(a, b);
                System.out.println("La resta de " + a + " y " + b + " es: " + resultado);
                break;
            case 3:
                resultado = multiplicar(a, b);
                System.out.println("La multiplicación de " + a + " y " + b + " es: " + resultado);
                break;
            case 4:
                try {
                    resultado = dividir(a, b);
                    System.out.println("La división de " + a + " entre " + b + " es: " + resultado);
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;
            default:
                System.out.println("Opción inválida");
        }
    }
}
