package utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtils {
private static final EntityManagerFactory emf;
// en vez de usar main() ....usar un inicializador estatico

static {
	try {
	emf=Persistence.createEntityManagerFactory("DemoJPA");
	}catch(Throwable ex) {
		System.out.println("la factoria no inicio " + ex.getMessage());
		throw new ExceptionInInitializerError(ex);
	}
}

public static EntityManagerFactory getEmf() {
	return emf;
}

}
