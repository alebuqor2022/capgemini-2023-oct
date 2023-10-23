package com.capgemini;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplement implements UserService{
// implementa todos los metodos hacia el frontEnd
// Dependency Injection ... con la marca de @Autowired
// shared aggregation --> relacion del rombo blanco

	@Autowired
private UserRepository repositorio;

//public UserServiceImplement(UserRepository up) {
//	this.repositorio=up;
//}
	
	
	@Override
	public User listarId(long id) {
		return repositorio.findById(id);
	}

	@Override
	public List<User> listar() {
		return repositorio.findAll();
	}

	@Override
	public User agregar(User u) {
		return repositorio.save(u);
	}

	@Override
	public User modificar(User u) {
		return repositorio.save(u);
	}

	@Override
	public void delete(long id) {
		User u=repositorio.findById(id);
		if ( u!=null) {
			repositorio.delete(u);
		}
		
	}

}
