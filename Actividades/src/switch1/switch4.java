package switch1;

import java.util.Scanner;

public class switch4 {
    
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecciona una opción:");
        System.out.println("1. Mostrar información");
        System.out.println("2. Editar perfil");
        System.out.println("3. Salir");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Mostrando información...");
           
                break;
            case 2:
                System.out.println("Editando perfil...");
               
                break;
            case 3:
                System.out.println("Saliendo...");
                
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
}

