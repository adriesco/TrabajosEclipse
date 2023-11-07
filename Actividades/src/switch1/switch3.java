package switch1;

import java.util.Scanner;

public class switch3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cantidad de dinero:");
        double cantidad = scanner.nextDouble();
        System.out.println("¿Deseas convertir a Dólares (D) o Euros (E)?");
        char moneda = scanner.next().charAt(0);

        double resultado;
        double tasaCambio = 1.12; // Supongamos que 1 euro equivale a 1.12 dólares

        switch (moneda) {
            case 'D':
            case 'd':
                resultado = cantidad * tasaCambio;
                System.out.println(cantidad + " euros son " + resultado + " dólares.");
                break;
            case 'E':
            case 'e':
                resultado = cantidad / tasaCambio;
                System.out.println(cantidad + " dólares son " + resultado + " euros.");
                break;
            default:
                System.out.println("Moneda no válida.");
                break;
        }
    }
}
