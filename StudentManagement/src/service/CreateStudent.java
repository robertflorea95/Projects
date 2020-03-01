package service;

import java.sql.Date;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Student;

public class CreateStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please insert the following information about the student:");
		
		System.out.println("Id:");
		int id = in.nextInt();
		
		System.out.println("Name:");
		String name = in.next();
		
		System.out.println("Surname:");
		String surname = in.next();

		System.out.println("Year");
		int year = in.nextInt();
		
		System.out.println("Degree:");
		String degree = in.next();
		
		System.out.println("Birthdate:");
		String birthdate = in.next();
		
		System.out.println("Location:");
		String location = in.next();
		
		System.out.println("Country:");
		String country = in.next();
		
		EntityManagerFactory entityManagFactory = Persistence.createEntityManagerFactory("StudentManagement");
		
		EntityManager entityManag = entityManagFactory.createEntityManager();
		entityManag.getTransaction().begin();
		
		Student s1 = new Student(id, name, surname, year, degree, birthdate, location, country);
		
		entityManag.persist(s1);
		entityManag.getTransaction().commit();

		entityManag.close();
		entityManagFactory.close();
		
	}

}
