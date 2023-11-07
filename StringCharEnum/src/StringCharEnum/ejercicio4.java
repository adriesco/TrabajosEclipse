package StringCharEnum;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingresa una palabra:");
        String palabra = scanner.nextLine();
        
        
        String palabraInvertida = new StringBuilder(palabra).reverse().toString();
        System.out.println("La palabra invertida es: " + palabraInvertida);
    }
}
		
