package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entity.Student;

public class SelectStudents{
	
	public static List<Student> selectStudents(){
		
		List<Student> listOfStudents = new ArrayList();
		
		EntityManagerFactory entMngFact = Persistence.createEntityManagerFactory("StudentManagement");
		EntityManager entMng = entMngFact.createEntityManager();
		
		System.out.println("Please enter an option: ");
		System.out.println("1 - select students which are in a certain year");
		System.out.println("2 - select students which have a certain degree");
		System.out.println("3 - select students which are born before a certain date");
		System.out.println("0 - exit");
		
		Scanner in = new Scanner(System.in);
		
		String option = in.nextLine();
		
		switch(option)
		{
			case "1":
			{
				System.out.println("Enter the year:");
				
				String year = in.nextLine();
				
				Query sqlQuery = entMng.createQuery("Select s " + "from Student s " + "WHERE s.year = " + Integer.parseInt(year));
				
				listOfStudents = (List<Student>) sqlQuery.getResultList();
				
				break;
			}
			
			case "2":
			{
				System.out.println("Enter the degree:");
				
				String degree = in.nextLine();
				
				Query sqlQuery = entMng.createQuery("SELECT s " + "FROM Student s " +  "WHERE s.degree LIKE \'%" + degree + "%\'");
				
				listOfStudents = (List<Student>) sqlQuery.getResultList();
				
				break;
			}
			
			case "3":
			{
				System.out.println("Enter the date (format is dd-MM-yyyy):");
				
				String date = in.nextLine();
				
				Pattern datePattern  = Pattern.compile("^(1[0-2]|0[1-9])-(3[01]|[12][0-9]|0[1-9])-[0-9]{4}$");
				
				Matcher matcher = datePattern.matcher(date);
				
				if(matcher.matches() == true) {
				
				Query sqlQuery = entMng.createQuery("SELECT s " + "FROM Student s " + "WHERE s.birthDate = " + "\'" + date + "\'");
				
				listOfStudents = (List<Student>) sqlQuery.getResultList();
				
				}else {
					
					System.out.println("Date is in wrong format!");
					SelectStudents.selectStudents();
				
				}
				
				break;
				
			}
			case "0":
			{
				break;
			}
				
		}
		
		return listOfStudents;
		
	}

}
