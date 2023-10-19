package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import model.Persona;
import utils.JpaUtils;

public class DaoPersona {
	// DAO = data access object
	// crud = create read update delete ABM (alta baja modificacion)
public static void create(Persona p) {
	EntityManager em=JpaUtils.getEmf().createEntityManager();
	em.getTransaction().begin();
	try {
	em.persist(p); // hacer el insert
	em.getTransaction().commit();
	} catch (Exception e) {
		em.getTransaction().rollback(); // retroceso, no hace cambios
		System.out.println(e.getMessage());
	} finally {
		em.close();
	}
	
}

public static Persona find(Long id) {
	EntityManager em=JpaUtils.getEmf().createEntityManager();
	Persona p=null;
	try {
	p=em.find(Persona.class, id);
	}catch (Exception e) {
		System.out.println("no se encontro" + e.getMessage());
	}finally {
		em.close();
	}
	return p;
}

public static void update(Persona p) {
	EntityManager em=JpaUtils.getEmf().createEntityManager();
	EntityTransaction tx=em.getTransaction();
	tx.begin();
	
	try {
		em.merge(p); // hace el update
		tx.commit();
		System.out.println("exito en la actualizacion");
	} catch (Exception e) {
		tx.rollback(); // retroceso, no hace cambios
		System.out.println("no se pudo modificar " + e.getMessage());
	} finally {
		em.close();
	}
	
	
}

public static void delete(Long id) {
	EntityManager em=JpaUtils.getEmf().createEntityManager();
	em.getTransaction().begin();
	try {
		Persona p=em.find(Persona.class, id);
		em.remove(p); // Delete * from personas where personas.id= id
		em.getTransaction().commit();
	}catch (Exception e) {
		em.getTransaction().rollback(); // retroceso, no hace cambios
		System.out.println(e.getMessage());
	} finally {
		em.close();
	}
}
}
