package switch1;

import java.util.Scanner;

public class switch5 {
    public static void main(String[] args) {
        
    	
    	Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numer del 1 al 5:");
        int calificacion = scanner.nextInt();

        switch (calificacion) {
            case 1:
                System.out.println("Insuficiente");
                break;
            case 2:
                System.out.println("Suficiente");
                break;
            case 3:
                System.out.println("Bien");
                break;
            case 4:
                System.out.println("Notable");
                break;
            case 5:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Calificación no válida.");
                break;
        }
    }
}
