package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
	@Column
		private String nombreUsuario;
	@Column
		private String password;
	@OneToOne
	@JoinColumn(name="id")
	private Persona persona;
}
