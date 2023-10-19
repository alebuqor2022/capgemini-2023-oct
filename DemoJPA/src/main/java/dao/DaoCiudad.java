package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import model.Ciudad;
import model.Curso;
import utils.JpaUtils;

public class DaoCiudad {
	public static List<Ciudad> findAllCiudades(long fk) {
		EntityManager em=JpaUtils.getEmf().createEntityManager();
		Query cursos=em.createNativeQuery("SELECT nombre FROM ciudades where fk_pais="+fk+";");
        List<Ciudad> c=cursos.getResultList();
		
		return c;
	}
	
	public static void create(Ciudad p) {
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

	public static Ciudad find(Long id) {
		EntityManager em=JpaUtils.getEmf().createEntityManager();
		Ciudad p=null;
		try {
		p=em.find(Ciudad.class, id);
		}catch (Exception e) {
			System.out.println("no se encontro" + e.getMessage());
		}finally {
			em.close();
		}
		return p;
	}

	public static void update(Ciudad p) {
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
			Ciudad p=em.find(Ciudad.class, id);
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
