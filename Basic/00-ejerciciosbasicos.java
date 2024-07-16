
/* 1. Crear dos variables numéricas de tipo entero. Realizar estas operaciones en este orden:
 a. Dar un valor a la primera
 b. Le damos a la segunda el valor de la primera
 c. Imprimir por pantalla las dos variables
 d. Cambiar el valor de la segunda variable y volver a imprimir las variables por pantalla */

public class Ejercicio1{
    public static void main(String[] args){
        int variable1 = 10; // a. Dar un valor a la primera
        int variable2 = variable1; // b. Le damos a la segunda el valor

        System.out.println("Variable 1: " + variable1); // c. Imprimir por pantalla las dos variables
        System.out.println("Variable 2: " + variable2);

        variable2 = 20; // d. Cambiar el valor de la segunda variable
        System.out.println("Variable 1: " + variable1); // Volver a imprimir las variables por pantalla
        System.out.println("Variable 2: " + variable2);
    }
}

/* 2. Dadas dos variables numéricas A y B con los valores que elijas, realizar un
programa para intercambiar los valores de ambas variables y muestre su
valor por pantalla */

public class Ejercicio2 {
    public static void main(String[] args) {
        int A = 5;
        int B = 10;

        System.out.println("Valor inicial de A: " + A);
        System.out.println("Valor inicial de B: " + B);

        // Intercambiar los valores de A y B
        int temp = A;
        A = B;
        B = temp;

        System.out.println("Valor final de A: " + A);
        System.out.println("Valor final de B: " + B);
    }
}

/* 3. Escribe un programa donde se declaren dos variables int (con el valor que desees), muestra por consola la suma, resta, multiplicación, división y módulo
(%) (resto de la división) */

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

/* 4. Escribe un programa donde se declare un String (cadena de texto) que contenga tu nombre. Después, muestra un mensaje de bienvenida por
consola. Por ejemplo: si el nombre es “Fernando”, debe aparecer “Bienvenido Fernando”. */

public class Ejercicio4 {
    public static void main(String[] args) {
        String nombre = "Fernando";

        System.out.println("Bienvenido " + nombre);
    }
}