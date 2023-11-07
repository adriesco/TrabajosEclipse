package WHILE;

import java.util.Scanner;

public class while4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 100;
		int m = 1;
	;	
		System.out.println("Escribe un numero");	
			
			int pedir = scanner.nextInt();
			
		
		int numero = (int) (Math.floor(Math.random()*(n-m+1)+m));
		while(pedir != numero) {
			if(pedir < numero) {
				System.out.println("Mas grande");
			} 
			else if (pedir > numero) {
				System.out.println("Mas pequeño");
			} 
			pedir = scanner.nextInt();
			
			
			
			
			
		}
		
		System.out.println("Has acertado, felicidades por jugar");
		
       
	}

}
