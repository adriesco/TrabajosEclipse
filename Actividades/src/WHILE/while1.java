package WHILE;

import java.util.Scanner;

public class while1 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero"); 
        int numero = sc.nextInt();
		 int i = 1 ;
		 
		
		 while(i <= numero ) {
			 i ++;
			 System.out.println(i);
		 }
	

	}

}
