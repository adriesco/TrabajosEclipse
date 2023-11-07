package buclesanidadosycondiciones;

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        // Declaramos las variables para los números
        int num1, num2, num3;

        // Pedimos al usuario que ingrese los números
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = sc.nextInt();
        System.out.println("Ingrese el tercer número: ");
        num3 = sc.nextInt();

        // Comparamos el primer número con el segundo
        if (num1 > num2) {
            // Si el primer número es mayor que el segundo, comparamos el primer número con el tercero
            if (num1 > num3) {
                // Si el primer número es mayor que el tercero, es el mayor de los tres
                System.out.println("El número mayor es " + num1);
            } else {
                // Si el primer número es menor que el tercero, el tercero es el mayor de los tres
                System.out.println("El número mayor es " + num3);
            }
        } else {
            // Si el primer número es menor que el segundo, comparamos el segundo número con el tercero
            if (num2 > num3) {
                // Si el segundo número es mayor que el tercero, es el mayor de los tres
                System.out.println("El número mayor es " + num2);
            } else {
                // Si el segundo número es menor que el tercero, el tercero es el mayor de los tres
                System.out.println("El número mayor es " + num3);
            }
        }
    }
}