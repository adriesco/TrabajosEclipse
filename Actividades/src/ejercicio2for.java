import java.util.Scanner;
public class ejercicio2for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

	    System.out.print("Ingrese un número: ");
	    int numero = scanner.nextInt();
        int suma = 0;
      
	    for (int i = 1; i <= numero; i ++) {
	    	if (i%2==0);{
	    		suma = suma + i;
	    	}
	    	
	      
	    }

	    System.out.println(suma);
	  }
	}
