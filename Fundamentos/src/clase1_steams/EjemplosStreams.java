package clase1_steams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemplosStreams {

	public static void main(String[] args) {
	//	ejemplo1();
	//	ejemplo2();
		ejemplo3();

	}
	
	public static void ejemplo1() {
		// 1era forma
		Stream.iterate(0, n -> n + 10).limit(15).forEach(ImprimirStream::imp);
		System.out.println("++++++++++++++++++++++");
		// 2da forma
		Stream<Integer> nros=Stream.iterate(0, n -> n + 5);
		nros.limit(10).forEach(ImprimirStream::imp);
	}

	public static void ejemplo2() {
		// caso1
		List<Integer> li=Arrays.asList(5,6,10,25,74);
		int suma = li
				.stream()
				.mapToInt(x -> x.intValue())
				.sum();
		System.out.println("la suma es " + suma);
		
		// caso2
		long pares=li
				.stream()
				.mapToLong(x -> x.longValue())
				.filter(x -> x % 2 == 0)
				.count();
		System.out.println("la cant de nros pares es " + pares);
		
		// caso3
		Object[] arrIntPares=Stream.of(5,6,10,25,74)
									.filter(x-> x%2==0)
									.toArray();
		for(Object elemento: arrIntPares) {
			System.out.println("el nro par es " + elemento);
		}
	}

	public static void ejemplo3() {
		List<Persona> lista=new ArrayList<>();
		lista.add(new Persona("Ale", 50000));
		lista.add(new Persona("Patri", 45000));
		lista.add(new Persona("Sergio", 75000));
		lista.add(new Persona("Pablo", 15000));
		
		double promedio=lista.stream().mapToInt(persona -> persona.salario).average().getAsDouble();
		System.out.println("el promedio del salario es " + promedio);
	}
}
