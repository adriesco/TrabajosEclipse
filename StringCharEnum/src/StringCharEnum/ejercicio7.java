package StringCharEnum;
import java.util.Scanner;


public class ejercicio7 {
    enum DiaSemana {
        LUNES, MARTES, MIÉRCOLES, JUEVES, VIERNES, SÁBADO, DOMINGO
    }

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	
    	
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número del 1 al 7:");
        int numero = scanner.nextInt();

        if (numero < 1 || numero > 7) {
            System.out.println("Número inválido. Debe ser entre 1 y 7.");
        } else {
            DiaSemana dia = DiaSemana.values()[numero - 1];
            System.out.println("El día de la semana es: " + dia);
        }
    }
}