package com.capgemini.model;

import jakarta.persistence.*;

@Entity
@Table(name="talleres")
public class Curso {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
	@Column
		private String nombreCurso;
	@Column
		private String nombreInstructor;
	@Column
	private String email;
}
