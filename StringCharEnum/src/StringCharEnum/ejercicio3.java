package StringCharEnum;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner scanner = new Scanner(System.in);
	        System.out.println("Por favor, ingresa una cadena de texto en minusculas:");
	        String texto = scanner.nextLine();
	        
	        int contador = 0;
	        for (int i = 0; i < texto.length(); i++) {
	            char caracter = texto.charAt(i);
	            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
	            	contador ++ ;			}
	            
	            }
	        System.out.print("En esta linea de texto aparecen " + contador + " minusculas");
	        
		

	}

}


