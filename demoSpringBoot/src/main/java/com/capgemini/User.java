package com.capgemini;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table(name="users")
public class User {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
	@Column
		private String nombre;
	@Column
		private String apellido;
	@Column(name="fecNac")
		private LocalDate fechaNacimiento;
	@Column
	private String area;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
}
