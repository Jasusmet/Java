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
consola. Por ejemplo: si el nombre es “Fernando”, debe aparecer “Bienvenido Fernando” */

public class Ejercicio4 {
    public static void main(String[] args) {
        String nombre = "Fernando";

        System.out.println("Bienvenido " + nombre);
    }
}

/* 5. Escribe un programa para hacer lo siguiente:
 a. Declarar una variable P de tipo int, una variable A de tipo double y una variable C de tipo char
 b. Asignar a cada una un valor
 c. Después, mostrar por pantalla:
    i.      El valor de cada variable
    ii.     La suma de P + A
    iii.    La diferencia de A - P
*/

public class Ejercicio5 {
    public static void main(String[] args) {
        // Declarar variables
        int P = 10;
        double A = 20.5;
        char C = 'A';

        // Mostrar valores de cada variable
        System.out.println("Valor de P: " + P);
        System.out.println("Valor de A: " + A);
        System.out.println("Valor de C: " + C);

        // Operaciones
        System.out.println("Suma de P + A: " + (P + A));
        System.out.println("Diferencia de A - P: " + (A - P));
    }
}

/* 6. Escribe un programa que haga lo siguiente:
 a. Declarar dos variables X e Y de tipo int
 b. Dos variables N y M de tipo double
 c. Asigna a cada una un valor
 d. A continuación muestra por pantalla:
    i.      El valor de cada variable
    ii.     La suma X + Y
    iii.    La diferencia x - Y
    iv.     El producto X * Y
    v.      El cociente X / Y
    vi.     El resto X % Y
    vii.    La suma N + M
    viii.   La diferencia N – M
    ix.     El producto N * M
    x.      El cociente N / M
    xi.     El resto N % M
    xii.    La suma X + N
    xiii.   El cociente Y / M
    xiv.    El resto Y % M
    xv.     El doble de cada variable
    xvi.    La suma de todas las variables
    xvii.   El producto de todas las variables
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        // Declarar variables
        int X = 5;
        int Y = 3;
        double N = 10.2;
        double M = 2.5;

        // Mostrar valores de cada variable
        System.out.println("Valor de X: " + X);
        System.out.println("Valor de Y: " + Y);
        System.out.println("Valor de N: " + N);
        System.out.println("Valor de M: " + M);

        // Operaciones
        System.out.println("Suma de X + Y: " + (X + Y));
        System.out.println("Diferencia de X - Y: " + (X - Y));
        System.out.println("Producto de X * Y: " + (X * Y));
        System.out.println("Cociente de X / Y: " + (X / Y));
        System.out.println("Resto de X % Y: " + (X % Y));

        System.out.println("Suma de N + M: " + (N + M));
        System.out.println("Diferencia de N - M: " + (N - M));
        System.out.println("Producto de N * M: " + (N * M));
        System.out.println("Cociente de N / M: " + (N / M));
        System.out.println("Resto de N % M: " + (N % M));

        System.out.println("Suma de X + N: " + (X + N));
        System.out.println("Cociente de Y / M: " + (Y / M));
        System.out.println("Resto de Y % M: " + (Y % M));

        // Doble de cada variable
        System.out.println("Doble de X: " + (X * 2));
        System.out.println("Doble de Y: " + (Y * 2));
        System.out.println("Doble de N: " + (N * 2));
        System.out.println("Doble de M: " + (M * 2));

        // Suma de todas las variables
        System.out.println("Suma de todas las variables: " + (X + Y + N + M));

        // Producto de todas las variables
        System.out.println("Producto de todas las variables: " + (X * Y * N * M));
    }
}

/* 7. Realizar un ejercicio en el que se calcule el área de un rectángulo y de un
triángulo. Para cada uno declaramos las variables que necesitemos para su cálculo
 a. area_rectangulo = lado * lado
 b. area_triangulo = base * altura/2
 */

public class Ejercicio7 {
    public static void main(String[] args) {
        // Declarar variables para rectángulo
        double lado = 5.0;

        // Declarar variables para triángulo
        double base = 3.0;
        double altura = 4.0;

        // Calcular áreas
        double areaRectangulo = lado * lado;
        double areaTriangulo = base * altura / 2;

        // Mostrar resultados
        System.out.println("Área del rectángulo: " + areaRectangulo);
        System.out.println("Área del triángulo: " + areaTriangulo);
    }
}