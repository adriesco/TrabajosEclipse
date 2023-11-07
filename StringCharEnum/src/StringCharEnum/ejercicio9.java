package StringCharEnum;
import java.util.Scanner;

public class ejercicio9 {
	enum Mes {
        ENERO(31), FEBRERO(28), MARZO(31), ABRIL(30), MAYO(31), JUNIO(30),
        JULIO(31), AGOSTO(31), SEPTIEMBRE(30), OCTUBRE(31), NOVIEMBRE(30), DICIEMBRE(31);

        private final int dias;

        Mes(int dias) {
            this.dias = dias;
        }

        public int getDias() {
            return dias;
        }
    }
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número del 1 al 12 para seleccionar un mes:");
        int numero = scanner.nextInt();

        if (numero < 1 || numero > 12) {
            System.out.println("Número inválido. Debe ser entre 1 y 12.");
        } else {
            Mes mes = Mes.values()[numero - 1];
            System.out.println("El mes de " + mes + " tiene " + mes.getDias() + " días.");
        }
    }
}
