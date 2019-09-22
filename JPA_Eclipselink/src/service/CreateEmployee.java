package service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import entity.Employee;

public class CreateEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("JPA_Eclipselink");
		
		EntityManager entitymanager = emFactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Employee employee = new Employee();
		employee.setEid(1201);
		employee.setName("Florea Robert");
		employee.setSalary(2000);
		employee.setDeg("Specialist");
		
		entitymanager.persist(employee);
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emFactory.close();
		
	}

}
