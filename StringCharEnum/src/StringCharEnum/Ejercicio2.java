package StringCharEnum;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
		
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingresa una frase:");
        
        
        String frase = scanner.nextLine();
        String fraseModificada = frase.replace('e', 'x');
        
        
        System.out.println("La frase nueva es " + fraseModificada);
    }
}


	