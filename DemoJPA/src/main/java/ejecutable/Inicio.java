package ejecutable;

import java.time.LocalDate;
import java.util.Date;

import dao.DaoPersona;
import model.Persona;

public class Inicio {

	public static void main(String[] args) {
		//crearPersona();
		buscarPersona(2L);
		//actualizarPersona() ;
		//borraPersona(1L);

	}
	
	public static void crearPersona() {
		Persona p=new Persona();
		p.setNombre("Jose");
		p.setApellido("Garcia");
		LocalDate fecha=LocalDate.of(1990,01,07);
		p.setFechaNacimiento(fecha);
		DaoPersona.create(p);
	}
	
	public static void buscarPersona(Long id) {
		Persona p=DaoPersona.find(id);
		System.out.println("la persona se llama " + p.getNombre());
	}

	public static void actualizarPersona() {
		Persona p=DaoPersona.find(3L);
		p.setApellido("Trefila");
		p.setNombre("Federico");
		
		DaoPersona.update(p);
		buscarPersona(3L);
	}
	
	public static void borraPersona(Long id) {
		DaoPersona.delete(id);
		
	}
}
