package EjerciciosBásicos;

/*
 3. Escribe un programa donde se declaren dos variables int (con el valor que desees),
muestra por consola la suma, resta, multiplicación, división y módulo (%) (resto de la división)
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        System.out.println("División: " + (num1 / num2));
        System.out.println("Módulo (resto de la división): " + (num1 % num2));
    }
}
