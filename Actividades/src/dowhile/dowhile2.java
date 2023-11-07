package dowhile;
import java.util.Scanner;

public class dowhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int N = scanner.nextInt();
        int suma = 0;
        int i = 2;

        do {
            suma += i;
            i += 2;
        } while (i <= N);

        System.out.println("La suma de todos los números pares desde 2 hasta " + N + " es " + suma);
    }
}
