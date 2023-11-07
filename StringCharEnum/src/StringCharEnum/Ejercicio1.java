package StringCharEnum;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
		
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingresa una cadena de texto:");
        String texto = scanner.nextLine();
        
        
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (caracter == 'a' || caracter == 'A') {
                contador++;
            }
        }
        System.out.println("La letra 'a' aparece " + contador + " veces en la frase");
    }
}