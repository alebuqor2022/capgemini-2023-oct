package ejecutable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import dao.DaoCiudad;
import dao.DaoCurso;
import dao.DaoEstudiante;
import dao.DaoPais;
import dao.DaoPersona;
import model.Ciudad;
import model.Curso;
import model.Estudiante;
import model.Pais;
import model.Persona;

public class Inicio {

	public static void main(String[] args) {
		// trabajando con Personas
		// crearPersona();
		// buscarPersona(2L);
		// actualizarPersona() ;
		// borraPersona(1L);
		// trabajando con Estudiantes y Cursos
		// testEstudianteCurso();
		// crearPaisCiudad() ;
		testPaisCiudad();
	}

	public static void testPaisCiudad() {
		try {
			Pais p = DaoPais.find(1L);
			System.out.println("-----pais en BD----");
			System.out.println(p.getNombre());

			System.out.println("---- ciudades ----");

			List<Ciudad> listado = DaoCiudad.findAllCiudades(1L);
			if (listado.size() == 0) {
				System.out.println("no encontro ciudades ");
			} else {
				for (int i = 1; i <= listado.size(); i++) {
					System.out.println(listado.get(i));
				}
			}
		} catch (NullPointerException ex) {
			System.out.println("no encontro el pais " + ex.getMessage());
		} catch (Exception e) {
			System.out.println("no encontro ciudades " + e.getMessage());
		}
	}

	public static void crearPaisCiudad() {
		Pais p = new Pais();
		p.setNombre("Alemania");
		DaoPais.create(p);
		Pais p1 = new Pais();
		p1.setNombre("Brasil");
		DaoPais.create(p1);

		Ciudad c = new Ciudad();
		c.setNombre("Berlin");
		c.setPais(p);
		DaoCiudad.create(c);

		Ciudad c1 = new Ciudad();
		c1.setNombre("Munich");
		c1.setPais(p);
		DaoCiudad.create(c1);

	}

	public static void crearPersona() {
		Persona p = new Persona();
		p.setNombre("Jose");
		p.setApellido("Garcia");
		LocalDate fecha = LocalDate.of(1990, 01, 07);
		p.setFechaNacimiento(fecha);
		DaoPersona.create(p);
	}

	public static void buscarPersona(Long id) {
		Persona p = DaoPersona.find(id);
		System.out.println("la persona se llama " + p.getNombre());
	}

	public static void actualizarPersona() {
		Persona p = DaoPersona.find(3L);
		p.setApellido("Trefila");
		p.setNombre("Federico");

		DaoPersona.update(p);
		buscarPersona(3L);
	}

	public static void borraPersona(Long id) {
		DaoPersona.delete(id);
	}

	public static void testEstudianteCurso() {
//		Curso c=new Curso();
//		c.setNombre("Java");
//		DaoCurso.create(c);
//		Curso c1=new Curso();
//		c1.setNombre("SQL");
//		DaoCurso.create(c1);
//		Curso c2=new Curso();
//		c2.setNombre("CSS");
//		DaoCurso.create(c2);
//		
//		Estudiante p=new Estudiante();
//		p.setNombre("Jose");
//		p.setApellido("Garcia");

//		List<Curso> lista=new ArrayList<Curso>();
//		lista.add(c);
//		lista.add(c1);
//		lista.add(c2);
//		p.setCursos(lista);

//		DaoEstudiante.create(p);

		System.out.println("--------------Estudiante--------------");
		Estudiante e1 = DaoEstudiante.find(2L);
		System.out.println(e1.getNombre() + " " + e1.getApellido());
		System.out.println("--------------Cursos--------------");
		List<Curso> listado = DaoCurso.findAllCursos(2L);

		for (Object o : listado) {
			System.out.println(resultado(o));
		}

	}

	private static String resultado(Object o) {
		return Arrays.asList((Object[]) o).toString();
	}
}
