package Arrays;

/* 2. Crea un array de números enteros de 20 elementos
a. Asígnale a cada posición los números del 1 al 20 utilizando un bucle
b. Imprime todos los elementos
c. Imprime todos los números menos la primera y última posición del array, ni tampoco la posición décima
d. Imprime sólo los números pares
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        // a. Crear array de 20 elementos y asignar valores del 1 al 20
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        // b. Imprimir todos los elementos
        System.out.println("Todos los elementos:");
        for (int elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();

        // c. Imprimir todos los números menos la primera y última posición del array, ni tampoco la posición décima
        System.out.println("Elementos sin primera, última y décima posición:");
        for (int i = 1; i < array.length - 1; i++) {
            if (i != 9) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        // d. Imprimir solo los números pares
        System.out.println("Números pares:");
        for (int elemento : array) {
            if (elemento % 2 == 0) {
                System.out.print(elemento + " ");
            }
        }
        System.out.println();
    }
}
