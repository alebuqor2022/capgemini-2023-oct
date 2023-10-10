package clase1_lambdas;

import java.util.Arrays;
import java.util.List;

public class Ejemplo2 {

	public static void main(String[] args) {
		String[] nums= {"rojo","verde","azul"};
		
		List<String> lista=Arrays.asList(nums);
		
		for(String i: lista) {
			System.out.println(i);
		}
		
		lista.replaceAll(s -> s.toUpperCase());
		System.out.println("la lista en mayuscula: "+ lista);
		

	}

}
