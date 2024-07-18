package Bucles;

/*
1. Crear un programa que imprima los números enteros entre el -10 y el -1. Escribe 3
soluciones, usando los 3 bucles que conocemos.
 */

// Usando el bucle "for"
public class Ejercicio1 {
    public static void main(String[] args) {
        for (int i = -10; i < 0; i++) {
            System.out.println(i);
        }
    }
}

// Usando el bucle "while"
//public class Ejercicio1 {
//    public static void main(String[] args) {
//        int i = -10;
//        while (i < 0) {
//            System.out.println(i);
//            i++;
//        }
//    }
//}

// Usando el bucle "do-while"
//public class Ejercicio1 {
//    public static void main(String[] args) {
//        int i = -10;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i < 0);
//    }
//}