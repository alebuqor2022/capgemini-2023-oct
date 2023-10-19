package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import model.Curso;
import utils.JpaUtils;

public class DaoCurso {
	public static List<Curso> findAllCursos(long fk){
		EntityManager em=JpaUtils.getEmf().createEntityManager();
		Query cursos=em.createNativeQuery("SELECT e.nombre as estudiante, c.nombre as curso "
				+ " FROM (estudiantes e inner join estudiante_cursos ec "
				+ "	ON e.id=ec.fk_estudiantes) inner join cursos c "
				+ " ON ec.fk_curso=c.id "
				+ "	where e.id=" + fk +";");
				
		List<Curso> c=cursos.getResultList();
		
		return c;
	}
	
	public static void create(Curso p) {
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

	public static Curso find(Long id) {
		EntityManager em=JpaUtils.getEmf().createEntityManager();
		Curso p=null;
		try {
		p=em.find(Curso.class, id);
		}catch (Exception e) {
			System.out.println("no se encontro" + e.getMessage());
		}finally {
			em.close();
		}
		return p;
	}

	public static void update(Curso p) {
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
			Curso p=em.find(Curso.class, id);
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
