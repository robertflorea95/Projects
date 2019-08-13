package service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Employee;

public class UpdateEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("JPA_Eclipselink");
		
		EntityManager entityManager = emFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		Employee employee = entityManager.find(Employee.class,  1201);
		
		//before update
		System.out.println(employee);
		employee.setSalary(8500);
		entityManager.getTransaction().commit();
		
		//after update
		System.out.println(employee);
		entityManager.close();
		emFactory.close();
		
	}

}
