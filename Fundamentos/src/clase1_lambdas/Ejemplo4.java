package clase1_lambdas;

import java.util.Arrays;

public class Ejemplo4 {

	public static void main(String[] args) {
		// Llamado implicito a ejecutar un lambda
		Arrays.asList(1,2,3,4,5).forEach(System.out::println);

	}

}
