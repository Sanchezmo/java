package persistanceJPA;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class JpaDataBase {

	public static void main(String[] args) {
		String rutabbdd="$objectdb/db/alumnos.odb";
		//crea la base de datos en la ruta especifica
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(rutabbdd);
		EntityManager em = emf.createEntityManager();
		//introduccion de objetos en bd, creamos 1 objeto
		
		
		//apertura de transaccion
		em.getTransaction().begin();
		
		//Alumno alumno1 = new Alumno("Pablo","Sanchez",7);
		
		//hacemos el persist en el entitymanager del objeto
		//em.persist(alumno1);
		
		//comprometemos la transacción
		em.getTransaction().commit();
		
		//consulta de datos query dinamica
		System.out.println("Query dinamica");
		int identificador=1;
		String consulta = "SELECT a FROM Alumno a WHERE id="+identificador;
		TypedQuery<Alumno> query =em.createQuery(consulta, Alumno.class);
		List<Alumno> results = query.getResultList();
		for(Alumno a : results) {
			System.out.println(a.getNombre()+" "+a.getApellido()+" "+a.getId());
		}
		System.out.println("Query dinamica con NamedQuery");
		TypedQuery<Alumno> query2 =em.createNamedQuery("Alumno.consultarTodo", Alumno.class);
		List<Alumno> results2 = query2.getResultList();
		for(Alumno b : results2) {
			System.out.println(b.getNombre()+" "+b.getApellido()+" "+b.getId());
		}
		
		
		
		
		em.close();
		emf.close();

	}

}
