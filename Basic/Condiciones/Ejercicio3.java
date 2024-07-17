package Condiciones;

import java.util.Scanner;

/*
3. Escribir un programa que al introducir el número de mes, indique en qué
estación del año estamos. Crear un programa utilizando if-else y otro
utilizando switch.
 */

// Programa utilizando if-else
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número del mes (1-12): ");
        int mes = scanner.nextInt();

        if (mes >= 1 && mes <= 3) {
            System.out.println("Estamos en Invierno");
        } else if (mes >= 4 && mes <= 6) {
            System.out.println("Estamos en Primavera");
        } else if (mes >= 7 && mes <= 9) {
            System.out.println("Estamos en Verano");
        } else if (mes >= 10 && mes <= 12) {
            System.out.println("Estamos en Otoño");
        } else {
            System.out.println("Mes inválido");
        }
    }
}

// Programa utilizando switch

//public class Ejercicio3 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Introduce el número del mes (1-12): ");
//        int mes = scanner.nextInt();
//
//        switch (mes) {
//            case 1:
//            case 2:
//            case 3:
//                System.out.println("Estamos en Invierno");
//                break;
//            case 4:
//            case 5:
//            case 6:
//                System.out.println("Estamos en Primavera");
//                break;
//            case 7:
//            case 8:
//            case 9:
//                System.out.println("Estamos en Verano");
//                break;
//            case 10:
//            case 11:
//            case 12:
//                System.out.println("Estamos en Otoño");
//                break;
//            default:
//                System.out.println("Mes inválido");
//        }
//    }
//}