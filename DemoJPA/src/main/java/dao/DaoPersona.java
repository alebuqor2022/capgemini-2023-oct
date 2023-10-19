package dao;

import javax.persistence.EntityManager;

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
}
