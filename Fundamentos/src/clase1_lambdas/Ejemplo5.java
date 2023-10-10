package clase1_lambdas;

public class Ejemplo5 {

	public static void main(String[] args) {
		// usamos la interface personalizada ... StringFunction
		StringFunction exclamar=(s) -> s + "!";
		StringFunction preguntar=(s) -> s + "?";
		
		System.out.println(exclamar.run("hola"));
		System.out.println(preguntar.run("chau"));

	}

}
