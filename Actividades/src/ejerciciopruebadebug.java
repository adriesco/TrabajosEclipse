
public class ejerciciopruebadebug { // divisible entre 2 y 3 se imprime
	//

	public static void main(String[] args) {
		int numero1 =1;
		while (numero1<10000) {
			numero1 ++;
			
			if (numero1%2==0 && numero1%3==0)
			System.out.println(numero1);
		}

	}

}
