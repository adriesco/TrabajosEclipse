import java.util.Scanner;

public class for2 {
	public static void main(String[] args) {
	    
		Scanner scanner = new Scanner(System.in);

	    System.out.print("Ingrese un número: ");
	    int n = scanner.nextInt();

	    System.out.println("Tabla de multiplicar del " + n);
	    for (int i = 1; i <= 10; i++) {
	      System.out.println(n + " x " + i + " = " + (n * i));
	    }
	  }
	}
