package clase1_lambdas;
import java.util.function.Consumer;

public class Ejemplo1 {

	public static void main(String[] args) {
		// caso tradicional
		String saludo=mostrarSaludo();
		verSaludo(saludo);
		// caso con Lambda
		Consumer<String> saludo1= s -> System.out.println("buen dia");
		System.out.println(saludo1.toString());
		
	}
	
	public static String mostrarSaludo() {
		return "hola";
	}
	public static void verSaludo(String saludo) {
		System.out.println(saludo);
	}

}
