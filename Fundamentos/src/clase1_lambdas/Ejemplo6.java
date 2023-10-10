package clase1_lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ejemplo6 {

	public static void main(String[] args) {
		Pais p1=new Pais("España");
		Pais p2=new Pais("Argentina");
		Pais p3=new Pais("Italia");
		Pais p4=new Pais("Brasil");
		
		List<Pais> paises=new ArrayList<Pais>();
		
		paises.add(p1);
		paises.add(p2);
		paises.add(p3);
		paises.add(p4);
		System.out.println("=== impresion segun carga de datos ===");
		paises.forEach((p) -> {System.out.println(p.nombre);});
//		System.out.println("=== impresion ordenada SIN lambdas ===");
//		comparadorAnonimo(paises);
//		paises.forEach((p) -> {System.out.println(p.nombre);});
		
		System.out.println("=== impresion ordenada CON lambdas ===");
		comparadosLambda(paises);
		paises.forEach((p) -> {System.out.println(p.nombre);});
	}

	
	public static void comparadorAnonimo(List<Pais> lista) {
		// sin lambdas, ordenar por alfabeto los elementos de la lista
		Collections.sort(lista, new Comparator<Pais>() {

			@Override
			public int compare(Pais o1, Pais o2) {
				// TODO Auto-generated method stub
				return o1.nombre.compareTo(o2.nombre);
			}});
	}
	
	public static void comparadosLambda(List<Pais> lista) {
		// con Lambdas
		Collections.sort(lista, (p1,p2) -> p1.nombre.compareTo(p2.nombre) );
		
	}
}
