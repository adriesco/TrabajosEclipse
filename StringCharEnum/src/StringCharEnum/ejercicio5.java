package StringCharEnum;
import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingresa una palabra o frase:");
        String texto = scanner.nextLine()
        		
        		;
        String textoModificado = texto.toLowerCase().replace(" ", "");
        String textoInvertido = new StringBuilder(textoModificado).reverse().toString();
        
        if (textoModificado.equals(textoInvertido)) {
            System.out.println("Es palíndromo");
        } else {
            System.out.println("No es palíndromo");
        }
    }
}
