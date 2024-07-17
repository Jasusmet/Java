package Arrays;

/*
 3. Crea un array de tipo char con un tamaño de 26 elementos. Rellena el array con los
números del 65 al 90, ambos incluidos. Por último, imprime todos los elementos del array.
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        // Crear array de tipo char con un tamaño de 26 elementos
        char[] array = new char[26];

        // Rellenar el array con los números del 65 al 90, ambos incluidos
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) (65 + i);
        }

        // Imprimir todos los elementos del array
        System.out.println("Elementos del array:");
        for (char elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
