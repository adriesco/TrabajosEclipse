package switch1;

import java.util.Scanner;

public class switch1ejercicio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	    System.out.print("Ingrese un número del 1 al 7 para saber tu dia de la semana: ");
	    int dia = scanner.nextInt();
	    
	    switch(dia) {
	    case 1: 
	    	System.out.println("Tu dia es lunes");
	    	break;
	    case 2: 
	    	System.out.println("Tu dia es martes");
	    	break;
	    case 3: 
	    	System.out.println("Tu dia es miercoles");
	    	break;
	    case 4: 
	    	System.out.println("Tu dia es jueves");
	    	break;
	    case 5: 
	    	System.out.println("Tu dia es viernes");
	    	break;
	    case 6:
	    	System.out.println("Tu dia es sabado");
	    	break;
	    case 7:
	    	System.out.println("Tu dia es domingo");
	    	break;
	    	}
	    
	   
	    
	   

	}

}
