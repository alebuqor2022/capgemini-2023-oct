package com.capgemini;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
