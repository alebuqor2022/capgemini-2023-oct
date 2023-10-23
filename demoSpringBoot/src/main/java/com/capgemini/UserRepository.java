package com.capgemini;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface UserRepository extends JpaRepository<User, Long>{
// esta interfaz dialoga hacia el motor de la BD
// CRUD ...ABM ... create, read, update, delete
	
User findById(long id);
List<User> findAll();
User save(User u);
void delete(User u);
	
}
