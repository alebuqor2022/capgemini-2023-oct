package ejecutable;

import java.time.LocalDate;
import java.util.Date;

import dao.DaoPersona;
import model.Persona;

public class Inicio {

	public static void main(String[] args) {
		crearPersona();

	}
	
	public static void crearPersona() {
		Persona p=new Persona();
		p.setNombre("Ale");
		p.setApellido("Buq");
		LocalDate fecha=LocalDate.of(1990,01,07);
		p.setFechaNacimiento(fecha);
		DaoPersona.create(p);
	}

}
