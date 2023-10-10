package clase1_lambdas;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Ejemplo3 {

	public static void main(String[] args) {
		ArrayList<Integer> nros=new ArrayList<Integer>();
		nros.add(5);
		nros.add(9);
		nros.add(8);
		nros.add(1);
		
		Consumer<Integer>metodo=(n)-> {System.out.println(n);};
		nros.forEach(metodo);
		
	}

}
