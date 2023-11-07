package dowhile;

import java.util.Scanner;

public class dowhile1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	    System.out.print("Ingrese un número: ");
	    int numero = scanner.nextInt();
	   

		int i = 0;
		do { 
		i ++;
	    System.out.println(numero + " x " + i + " = " + (numero * i));
	    
	    	
	    } while (i<10);

	}

}
