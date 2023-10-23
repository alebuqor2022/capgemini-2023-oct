package com.capgemini;

import java.util.List;

public interface UserService {
	// esta interfaz dialoga hacia el frontend
	// CRUD ...ABM ... create, read, update, delete
		
	User listarId(long id); //findById del repositorio
	List<User> listar();  // findAll del repo
	User agregar(User u); // save del repo
	User modificar(User u); // save del repo
	void delete(long id); // delete(User u); del repo
}
