package EjerciciosBásicos;

/*
7. Realizar un ejercicio en el que se calcule el área de un rectángulo y de un
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
