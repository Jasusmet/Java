package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/*
2. Para el sorteo del gordo de Navidad, se desea implementar un programa para
gestionar los números comprados en una peña.
Para ello, habrá que crear un programa en el que se usará un ArrayList de números
enteros.
El programa dispondrá de un menú desde donde los usuarios podrán
- agregar un número a la lista
- buscar un número
- modificar un número
- eliminar un número
- insertar un número en una posición dada por el usuario
 */

public class Ejercicio2 {
    private ArrayList<Integer> numeros;
    private Scanner scanner;

    public Ejercicio2() {
        this.numeros = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Agregar un número");
            System.out.println("2. Buscar un número");
            System.out.println("3. Modificar un número");
            System.out.println("4. Eliminar un número");
            System.out.println("5. Insertar un número en una posición");
            System.out.println("6. Salir");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarNumero();
                    break;
                case 2:
                    buscarNumero();
                    break;
                case 3:
                    modificarNumero();
                    break;
                case 4:
                    eliminarNumero();
                    break;
                case 5:
                    insertarNumeroEnPosicion();
                    break;
                case 6:
                    System.out.println("¡Adiós!");
                    return;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }

    private void agregarNumero() {
        System.out.print("Introduce el número a agregar: ");
        int numero = scanner.nextInt();
        numeros.add(numero);
        System.out.println("Número agregado con éxito");
    }

    private void buscarNumero() {
        System.out.print("Introduce el número a buscar: ");
        int numero = scanner.nextInt();
        if (numeros.contains(numero)) {
            System.out.println("El número se encuentra en la lista");
        } else {
            System.out.println("El número no se encuentra en la lista");
        }
    }

    private void modificarNumero() {
        System.out.print("Introduce el número a modificar: ");
        int numeroAntiguo = scanner.nextInt();
        if (numeros.contains(numeroAntiguo)) {
            System.out.print("Introduce el nuevo número: ");
            int numeroNuevo = scanner.nextInt();
            int indice = numeros.indexOf(numeroAntiguo);
            numeros.set(indice, numeroNuevo);
            System.out.println("Número modificado con éxito");
        } else {
            System.out.println("El número no se encuentra en la lista");
        }
    }

    private void eliminarNumero() {
        System.out.print("Introduce el número a eliminar: ");
        int numero = scanner.nextInt();
        if (numeros.contains(numero)) {
            numeros.remove((Integer) numero);
            System.out.println("Número eliminado con éxito");
        } else {
            System.out.println("El número no se encuentra en la lista");
        }
    }

    private void insertarNumeroEnPosicion() {
        System.out.print("Introduce el número a insertar: ");
        int numero = scanner.nextInt();
        System.out.print("Introduce la posición donde insertar el número: ");
        int posicion = scanner.nextInt();
        if (posicion >= 0 && posicion < numeros.size()) {
            numeros.add(posicion, numero);
            System.out.println("Número insertado con éxito");
        } else {
            System.out.println("Posición inválida");
        }
    }

    public static void main(String[] args) {
        Ejercicio2 programa = new Ejercicio2();
        programa.run();
    }
}
