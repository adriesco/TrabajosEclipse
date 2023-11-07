package StringCharEnum;

import java.util.Scanner;

public class ejercicio8 {
    enum TipoVehiculo {
             COCHE, MOTO, Avion
    }

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	
    	
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecciona un tipo de vehículo (1: Coche, 2: Moto, 3: Avion):");
        int numero = scanner.nextInt();

        if (numero < 1 || numero > 3) {
            System.out.println("Número inválido. Debe ser entre 1 y 3.");
        } else {
            TipoVehiculo tipo = TipoVehiculo.values()[numero - 1];
            switch (tipo) {
                case COCHE:
                    System.out.println("Has seleccionado Coche. ¡Buen viaje en tu coche!");
                    break;
                case MOTO:
                    System.out.println("Has seleccionado Moto. ¡Disfruta de tu viaje en moto!");
                    break;
                case Avion:
                    System.out.println("Has seleccionado Avion. ¡Que tengas un buen vuelo!");
                    break;
            }
        }
    }
}

