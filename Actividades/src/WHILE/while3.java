package WHILE;

import java.util.Scanner;

public class while3 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
		
	    System.out.print("Ingrese un número entero ");
	    int i = scanner.nextInt();
	   
	    int contador = 0;
	    
	    while(i>0){
	    	i=i/10;
	    	contador ++;
	    	System.out.print(contador);
	    }
	  
	    
		
		

	}

}
