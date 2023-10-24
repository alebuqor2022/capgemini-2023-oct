package com.capgemini.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

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
