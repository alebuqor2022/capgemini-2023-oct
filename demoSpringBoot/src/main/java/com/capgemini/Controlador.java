package com.capgemini;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users") // http://localhost:8080/users
public class Controlador {
	//Dependency Injection ... inyecto a traves del constructor por parametro
@Autowired
	UserService servicio;

@GetMapping("/")
public String home() {
	return "saludos";
	
}
@GetMapping("/listado") // http://localhost:8080/users/listado
public List<User> listar(){
	return servicio.listar();
}

@GetMapping(path= {"/id/{id1}"}) // http://localhost:8080/users/id/2
public User listarId(@PathVariable("id1") long id2) {
	return servicio.listarId(id2);
}

@PostMapping
public User agregar(@RequestBody User u) { //damos altas
	return servicio.agregar(u);
}

@PutMapping(path= {"/{id1}"})
public User editar(@PathVariable("id1") long id,@RequestBody User u) { // actualizamos 
	u.setId(id);
	return servicio.modificar(u);
}

@DeleteMapping(path= {"/{id1}"})
public void delete(@PathVariable("id1") long id) {
	servicio.delete(id);
	}


}
