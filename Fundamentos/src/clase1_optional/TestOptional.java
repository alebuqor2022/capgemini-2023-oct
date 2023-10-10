package clase1_optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TestOptional {

	public static void main(String[] args) {
		List<Nota> notas=new ArrayList<Nota>();
		notas.add(new Nota("matematica", 7));
		notas.add(new Nota("literatura", 8));
		notas.add(new Nota("ingles", 9));
		notas.add(new Nota("dibujo", 4));
		
		//ejemplo1(notas);
		ejemplo2(notas);

	}
	
	public static void ejemplo1(List<Nota> notas) {
		// caso tradicional
		Nota notaSuperior=verNotaSuperior(notas);
		if (notaSuperior == null) {
			System.out.println("no hay notas > 9");
		}else {
			System.out.println(notaSuperior.getAsignatura()+ ": " + notaSuperior.getValor());
		}
	}
	
	public static Nota verNotaSuperior(List<Nota> notas) {
		// caso tradicional
		Nota nota =null;
		for (Nota unaNota: notas) {
			if(unaNota.getValor()>9) {
				nota=unaNota;
			}
		}
		return nota;
	}

	public static void ejemplo2(List<Nota> notas) {
		Optional<Nota> oNota=verNotaSuperiorBis(notas);
		if(oNota.isPresent()) {
			Nota nota=oNota.get();
			System.out.println(nota.getAsignatura()+ ": " + nota.getValor());
		} else {
			System.out.println("no hay notas > 9");
		}
	}
	
	public static Optional<Nota> verNotaSuperiorBis(List<Nota> notas) {
		// caso con Optional
		for (Nota unaNota: notas) {
			if(unaNota.getValor()>9) {
				return Optional.of(unaNota);
			}
		}
		return Optional.empty();
	}
	
}
