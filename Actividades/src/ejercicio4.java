import java.util.Scanner;
public class ejercicio4 {

	
	public static void main(String[] args) {
	    
		Scanner scanner = new Scanner(System.in);
		
	    System.out.print("Ingrese un número positivo ");
	    int a = scanner.nextInt();
	    if (a >= 0 ) {
	    	for(int i = 1 ; i<=1 ; i++ ) {
	    	    System.out.println(a + " x 1 x 2 x 3 x 4 x 5 = " + (a * 1 * 2 * 3 * 4 * 5));
	    	    }
	    	
	    	
	    } else if (a < 0){
	    	System.out.println("Pon un numero positivo" );
	    	}
	
	
	}
}

