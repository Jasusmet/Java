package Condiciones;

import java.util.Scanner;

/*
2. Crear un programa que muestre un menú, en el que al seleccionar un número
nos indique qué plato hemos elegido en un restaurante.
- 1. Sopa de tiburón
- 2. Arroz 3 delicias
- 3. Cerdo agridulce
- 4. Pollo con almendras
- 5. Pato a la pekinesa
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al restaurante!");
        System.out.println("Seleccione un plato:");
        System.out.println("1. Sopa de tiburón");
        System.out.println("2. Arroz 3 delicias");
        System.out.println("3. Cerdo agridulce");
        System.out.println("4. Pollo con almendras");
        System.out.println("5. Pato a la pekinesa");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ha seleccionado: Sopa de tiburón");
                break;
            case 2:
                System.out.println("Ha seleccionado: Arroz 3 delicias");
                break;
            case 3:
                System.out.println("Ha seleccionado: Cerdo agridulce");
                break;
            case 4:
                System.out.println("Ha seleccionado: Pollo con almendras");
                break;
            case 5:
                System.out.println("Ha seleccionado: Pato a la pekinesa");
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}
