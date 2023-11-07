package buclesanidadosycondiciones;

import java.util.Scanner;
public class ejercicio4 {

    public static void main(String[] args) {
        // Declaramos las variables para los lados del triángulo
        double lado1, lado2, lado3;

        // Pedimos al usuario que ingrese los lados del triángulo
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer lado del triángulo: ");
        lado1 = sc.nextDouble();
        System.out.println("Ingrese el segundo lado del triángulo: ");
        lado2 = sc.nextDouble();
        System.out.println("Ingrese el tercer lado del triángulo: ");
        lado3 = sc.nextDouble();

        // Verificamos si los lados cumplen con las condiciones para formar un triángulo
        if (lado1 + lado2 < lado3 || lado1 + lado3 < lado2 || lado2 + lado3 < lado1) {
            System.out.println("Los lados ingresados no forman un triángulo.");
            return;
        }

        // Verificamos el tipo de triángulo
        if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("El triángulo es equilátero.");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("El triángulo es isósceles.");
        } else {
            System.out.println("El triángulo es escaleno.");
        }
    }
}
